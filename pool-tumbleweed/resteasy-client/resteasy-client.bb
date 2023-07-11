SUMMARY = "Client for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Client for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-client-3.0.26-3.11.noarch.rpm"
RPM_HASH = "35490b974c29778ace9c0af2be4e138c89927a529a29cb890b9278a69b8f91356d1c6bda54fea9e49836caaf0f24c56ab48acece5955be57015f56538bdf54f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-client \
mvn-org.jboss.resteasy-resteasy-client-pom- \
resteasy-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.resteasy-resteasy-jaxrs"

inherit rpm
