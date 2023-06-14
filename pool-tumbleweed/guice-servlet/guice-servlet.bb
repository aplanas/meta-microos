SUMMARY = "Servlet extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Servlet module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-servlet-5.1.0-1.1.noarch.rpm"
RPM_HASH = "da5469fac50262ee13e53bdce7e94678a731a938aa0fdcd0d1e417bdddbb6302cb2fd365b1c47400deb62fc591da7341d925be6fb010f54eeb5dac77f3c539f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-servlet \
mvn-com.google.inject.extensions-guice-servlet \
mvn-com.google.inject.extensions-guice-servlet-pom- \
mvn-org.sonatype.sisu.inject-guice-servlet \
mvn-org.sonatype.sisu.inject-guice-servlet-pom- \
osgi-com.google.inject.servlet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
