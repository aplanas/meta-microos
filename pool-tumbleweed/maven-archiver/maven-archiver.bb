SUMMARY = "Maven Archiver"
DESCRIPTION = "The Maven Archiver is used by other Maven plugins \
to handle packaging"
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-archiver-3.5.0-2.13.noarch.rpm"
RPM_HASH = "43e69d838d17ccefc43ad5a437ba8ee2be3edb317ca4cb0bfa365afbc028d60c1faa124f521262666b9547e9a35f732144309decfd76d1b224d7276d1666a3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-archiver-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
