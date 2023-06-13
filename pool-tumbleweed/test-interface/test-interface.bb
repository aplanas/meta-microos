SUMMARY = "Uniform interface to Scala and Java test frameworks"
DESCRIPTION = " \
Uniform test interface to Scala/Java test frameworks (specs, \
ScalaCheck, ScalaTest, JUnit and other)"
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "test-interface-1.0-2.5.noarch.rpm"
RPM_HASH = "45c9a022cd851f3835ebaa556bee1149e0d378121d71254dda6650f88bc194d46fe0eea69f30fcaa84428f1e093f302690d1aaf7d55c817501ee30b273e8bd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-sbt:test-interface) \
mvn(org.scala-sbt:test-interface:pom:) \
test-interface"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
