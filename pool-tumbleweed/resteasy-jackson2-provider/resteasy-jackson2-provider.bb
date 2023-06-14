SUMMARY = "Module jackson2-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jackson2-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jackson2-provider-3.0.26-3.10.noarch.rpm"
RPM_HASH = "efc04fd2cf4372c1f4cf7e4383fe100d1da69e84a4b80fdd15b1fa81d5debc25421419845523f082d2fe76604fdc2b18750642bacd00a5630191c06ed4eac900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-jackson2-provider \
mvn-org.jboss.resteasy-resteasy-jackson2-provider-pom- \
resteasy-jackson2-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-org.apache.tomcat-tomcat-servlet-api"

inherit rpm
