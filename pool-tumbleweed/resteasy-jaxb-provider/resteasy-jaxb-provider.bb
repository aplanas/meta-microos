SUMMARY = "Module jaxb-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jaxb-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jaxb-provider-3.0.26-3.10.noarch.rpm"
RPM_HASH = "ba12bbe4f0d580dfcff19f4c5edeaca310cb70a7c06f5094339d133d37f7ff45507f81bae4708444b2176be09f6a28d3f59a8eb72e7ec3958030fcc088c33cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jboss.resteasy:resteasy-jaxb-provider) \
mvn(org.jboss.resteasy:resteasy-jaxb-provider:pom:) \
resteasy-jaxb-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.sun.xml.bind:jaxb-impl) \
mvn(javax.xml.bind:jaxb-api) \
mvn(org.apache.tomcat:tomcat-servlet-api) \
mvn(org.jboss.logging:jboss-logging) \
mvn(org.jboss.logging:jboss-logging-annotations) \
mvn(org.jboss.logging:jboss-logging-processor)"

inherit rpm
