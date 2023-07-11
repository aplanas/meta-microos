SUMMARY = "Uniform interface to Scala and Java test frameworks"
DESCRIPTION = " \
Uniform test interface to Scala/Java test frameworks (specs, \
ScalaCheck, ScalaTest, JUnit and other)"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-1.0-2.6.noarch.rpm"
RPM_HASH = "b129f5cde4020de625ae2ed260575d147b9959e61eefef6cab6346024101123b186c87596a625eca0915b794537807ca07cde0aa55ecc80acd372132ac3cd8e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.scala-sbt-test-interface \
mvn-org.scala-sbt-test-interface-pom- \
test-interface"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
