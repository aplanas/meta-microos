SUMMARY = "Core modules for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Core modules for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-core-3.0.26-3.10.noarch.rpm"
RPM_HASH = "f7f1f65b1bf36c59b7813a18916aa4d2fa1c5e8ee6fb0ab3f2485dde58060eae7a68eee3fefdfdcdd4654190dc17f58a0cba24ce53bd5ad1398033b70cf11f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jboss.resteasy:providers-pom:pom:) \
mvn(org.jboss.resteasy:resteasy-jaxrs) \
mvn(org.jboss.resteasy:resteasy-jaxrs-all:pom:) \
mvn(org.jboss.resteasy:resteasy-jaxrs:pom:) \
resteasy-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(commons-io:commons-io) \
mvn(javax.activation:activation) \
mvn(javax.xml.bind:jaxb-api) \
mvn(org.apache.httpcomponents:httpclient) \
mvn(org.apache.tomcat:tomcat-servlet-api) \
mvn(org.jboss.logging:jboss-logging) \
mvn(org.jboss.logging:jboss-logging-annotations) \
mvn(org.jboss.logging:jboss-logging-processor) \
mvn(org.jboss.spec.javax.annotation:jboss-annotations-api_1.2_spec) \
mvn(org.jboss.spec.javax.ws.rs:jboss-jaxrs-api_2.0_spec)"

inherit rpm
