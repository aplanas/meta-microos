SUMMARY = "Module atom-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module atom-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-atom-provider-3.0.26-3.11.noarch.rpm"
RPM_HASH = "8f54b74d62817a6f3151c6ce732e11f8d71bfcb8d46573568b7e159cf006b161061b6788df7ddd2b52c1edbd99219afebeddd448c9d422522d7c716e91283451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-atom-provider \
mvn-org.jboss.resteasy-resteasy-atom-provider-pom- \
resteasy-atom-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.resteasy-resteasy-jaxb-provider \
mvn-org.jboss.resteasy-resteasy-jaxrs"

inherit rpm
