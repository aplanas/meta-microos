SUMMARY = "Logging-api module for maven-doxia"
DESCRIPTION = "This package provides Logging-api module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-logging-api-1.9.1-6.7.noarch.rpm"
RPM_HASH = "6fcbd94fa524ebb23c3ba3961b1291a63887d9381a370f350ba836e9d5018d81b39610fa97fe0614c8dacd2aa22a5a6ea710edf4657956ab87c94229ab6aed49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-logging-api \
mvn(org.apache.maven.doxia:doxia-logging-api) \
mvn(org.apache.maven.doxia:doxia-logging-api:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-container-default)"

inherit rpm
