SUMMARY = "API to manage report generation"
DESCRIPTION = "API to manage report generation. Maven-reporting-api is included in Maven 2.x \
core distribution, but moved to shared components to achieve report decoupling \
from Maven 3 core. \
 \
This is a replacement package for maven-shared-reporting-api"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-api-3.1.0-3.7.noarch.rpm"
RPM_HASH = "b8552d1f54d6f061b959811d577dbee05852a8bc5bfe958f76c13471951827dc2629b6f50930bcb0af4906ae7f9fb160532615f7b57279a94814dbcb6dd2edc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven.reporting:maven-reporting-api:pom:) \
mvn(org.apache.maven.shared:maven-reporting-api) \
mvn(org.apache.maven.shared:maven-reporting-api:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-sink-api)"

inherit rpm
