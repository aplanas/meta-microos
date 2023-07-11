SUMMARY = "Module jackson2-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jackson2-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jackson2-provider-3.0.26-3.11.noarch.rpm"
RPM_HASH = "a6d2ac44a75c7ac1fa5308f1cf08bc83bac8e7c042b2d222db2bd66638078693ec6bec65bd605384c4827bd13d900484e8f5adc40e954a60aec84583bcf65294"
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
