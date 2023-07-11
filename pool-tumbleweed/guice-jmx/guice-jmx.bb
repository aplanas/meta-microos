SUMMARY = "JMX extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JMX module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-jmx-5.1.0-1.2.noarch.rpm"
RPM_HASH = "0951fbcdf9c5a2b158d367bc9670528df22a581501e6837825aa3f18eb705bc8c1266d141da667e818b0e57306c47db2a5c69d8788606bbc349889adb997ffae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-jmx \
mvn-com.google.inject.extensions-guice-jmx \
mvn-com.google.inject.extensions-guice-jmx-pom- \
mvn-org.sonatype.sisu.inject-guice-jmx \
mvn-org.sonatype.sisu.inject-guice-jmx-pom- \
osgi-com.google.inject.tools.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
