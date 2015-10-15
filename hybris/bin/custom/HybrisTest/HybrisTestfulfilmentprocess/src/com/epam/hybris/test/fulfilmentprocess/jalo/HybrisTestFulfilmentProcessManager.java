/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.epam.hybris.test.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.epam.hybris.test.fulfilmentprocess.constants.HybrisTestFulfilmentProcessConstants;

import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class HybrisTestFulfilmentProcessManager extends GeneratedHybrisTestFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( HybrisTestFulfilmentProcessManager.class.getName() );
	
	public static final HybrisTestFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (HybrisTestFulfilmentProcessManager) em.getExtension(HybrisTestFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
