SUMMARY = "Compatibility Maven profile artifact"
DESCRIPTION = "Maven profile artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-profile-2.2.1-3.9.noarch.rpm"
RPM_HASH = "57869e213cb1427446977b5412a5529a1db475c6ddf99447da7e87c016c003c249af3fa712fc9fe00ea456bbfe693a915b86a5a227c30f6ac1bdfe78f0633105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-profile \
mvn-org.apache.maven-maven-profile \
mvn-org.apache.maven-maven-profile-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-model \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
