SUMMARY = "Maven Assembly Plugin"
DESCRIPTION = "A Maven plugin to create archives of your project's sources, classes, \
dependencies etc. from flexible assembly descriptors."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-assembly-plugin-3.3.0-2.9.noarch.rpm"
RPM_HASH = "8c7e11dc5927ba7feb4441a609bbdd0d38872b5f2e17f9cb5f077c4ae0d1c2d14621631b39e30eb0da5175be84751ea12d31f43387105f8f68a2a60ad725b64e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-shared-io \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
