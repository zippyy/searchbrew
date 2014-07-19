package com.searchbrew

case class FormulaDescription(title: String, description: String)

case class Formula(title: String, homepage: Option[String] = None, description: Option[String] = None)