SUMMARY = "Core modules for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Core modules for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-core-3.0.26-3.11.noarch.rpm"
RPM_HASH = "228cc5a55e7d98dc87cc718f11d8d0a8f150961cfcd514909b1363fcc3603985eab8ebc5e936668d4aaeef5285fffc80888cb8f37486809797e9755dba2c0b48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-providers-pom-pom- \
mvn-org.jboss.resteasy-resteasy-jaxrs \
mvn-org.jboss.resteasy-resteasy-jaxrs-all-pom- \
mvn-org.jboss.resteasy-resteasy-jaxrs-pom- \
resteasy-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.activation-activation \
mvn-javax.xml.bind-jaxb-api \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec"

inherit rpm
