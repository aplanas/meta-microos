SUMMARY = "JMX extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides JMX module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-jmx-5.1.0-1.1.noarch.rpm"
RPM_HASH = "4291c09f7c0ef9e50c81f664318dd5693d679e17d7b732131d1693972f5d8fa7eb726beaeb08f09128339225269173a8328ca4b3d45b0e7b20a48c3865301a2d"
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
