SUMMARY = "Client for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Client for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-client-3.0.26-3.10.noarch.rpm"
RPM_HASH = "ed9e0ec4c160e6cc0e32380b270b463a5a8d05014cdd9962fd4dd75fdd18d81914037516311e71a1fbfb4f9be9699eea12b7e8d93a89e5adb12c3316a8e75f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.jboss.resteasy:resteasy-client) \
mvn(org.jboss.resteasy:resteasy-client:pom:) \
resteasy-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.jboss.logging:jboss-logging) \
mvn(org.jboss.logging:jboss-logging-annotations) \
mvn(org.jboss.logging:jboss-logging-processor) \
mvn(org.jboss.resteasy:resteasy-jaxrs)"

inherit rpm
