SUMMARY = "Compatibility Maven project artifact"
DESCRIPTION = "Maven project artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-project-2.2.1-3.9.noarch.rpm"
RPM_HASH = "601074fddc78a5683db3a02dbe1abe4149bac439691fa58c0415a869ada6c58c86e57aa4074374e36265df9f50e5e2dba6bd4deaf7e0dc4038e95269cd0e4991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-project \
mvn-org.apache.maven-maven-project \
mvn-org.apache.maven-maven-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-artifact-manager \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-registry \
mvn-org.apache.maven-maven-profile \
mvn-org.apache.maven-maven-settings \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
