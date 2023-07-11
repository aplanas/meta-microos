SUMMARY = "Logging-api module for maven-doxia"
DESCRIPTION = "This package provides Logging-api module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-logging-api-1.9.1-6.8.noarch.rpm"
RPM_HASH = "9efd137aca3c8d8298a999537881b13df83fea4d365aecc2a5ef081366e41b5a540c1e49de6f41c2c3a30b709402362e3b0457cbf0d47098814e513e3efa84e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-logging-api \
mvn-org.apache.maven.doxia-doxia-logging-api \
mvn-org.apache.maven.doxia-doxia-logging-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default"

inherit rpm
