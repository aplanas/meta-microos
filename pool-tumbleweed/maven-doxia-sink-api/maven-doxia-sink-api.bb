SUMMARY = "Sink-api module for maven-doxia"
DESCRIPTION = "This package provides Sink-api module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-sink-api-1.9.1-6.7.noarch.rpm"
RPM_HASH = "ca853e6c9a5c4c68bacf7e38714372247a571287bc884d1c3e054d8ea7ce63c2f007d98a849833b2b7054b4feed086f386afb4b765378ee9c8ad0a0deea5a043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sink-api \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.apache.maven.doxia:doxia-sink-api:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-logging-api)"

inherit rpm
