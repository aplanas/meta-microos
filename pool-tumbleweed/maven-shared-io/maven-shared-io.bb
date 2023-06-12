SUMMARY = "API for I/O support like logging, download or file scanning"
DESCRIPTION = "API for I/O support like logging, download or file scanning."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-3.0.0-2.12.noarch.rpm"
RPM_HASH = "1c8e5164fcb9b87f0ffcccda84e8cac56a4a26433d548885b6fff91ac790fab87d63d4e51700de1b31bdba842e3c6bcb164489f66c7da9dee9cf1469b097b2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io \
mvn(org.apache.maven.shared:maven-shared-io) \
mvn(org.apache.maven.shared:maven-shared-io:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-compat) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
