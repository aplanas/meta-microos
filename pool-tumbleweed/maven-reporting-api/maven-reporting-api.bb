SUMMARY = "API to manage report generation"
DESCRIPTION = "API to manage report generation. Maven-reporting-api is included in Maven 2.x \
core distribution, but moved to shared components to achieve report decoupling \
from Maven 3 core. \
 \
This is a replacement package for maven-shared-reporting-api"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-api-3.1.0-3.8.noarch.rpm"
RPM_HASH = "cb7174c6bf852e4119b718593799c65ad1cd0061b01fc5868cc0ad59363afdd209319aef028d8bcd935d5888ce30f830199e7a79e63fe02924eca3027f82426e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-api-pom- \
mvn-org.apache.maven.shared-maven-reporting-api \
mvn-org.apache.maven.shared-maven-reporting-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-sink-api"

inherit rpm
