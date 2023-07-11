SUMMARY = "Servlet extension module for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Servlet module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-servlet-5.1.0-1.2.noarch.rpm"
RPM_HASH = "332e898aa05b3d1c17fb58fc5e77e88b0b12588abadadc6c16dd7fff5cfae2b24a4cf51ba279e0fe4b9cc75663e4842c95a9e306b826838f2433e5e68906cd05"
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
