SUMMARY = "API for I/O support like logging, download or file scanning"
DESCRIPTION = "API for I/O support like logging, download or file scanning."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-3.0.0-2.13.noarch.rpm"
RPM_HASH = "d829ca8fc3ded4225b3fd1d854958ae50f446100fb51d070ec66e56f2839005327439fc750edd655eeefd62048a91adb956b861b25892a1cf030a1fb7a5014e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-io-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
