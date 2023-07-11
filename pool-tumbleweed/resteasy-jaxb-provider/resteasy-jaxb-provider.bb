SUMMARY = "Module jaxb-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jaxb-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jaxb-provider-3.0.26-3.11.noarch.rpm"
RPM_HASH = "422ce53e420ab6e1e14b40cb0746d5b6dfdad96d87bb58897e0db75e4f48652d04e86f254fdf91bdb6197392cc868251973ad0503572eaf2441ab8068cea0f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-jaxb-provider \
mvn-org.jboss.resteasy-resteasy-jaxb-provider-pom- \
resteasy-jaxb-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind-jaxb-impl \
mvn-javax.xml.bind-jaxb-api \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor"

inherit rpm
