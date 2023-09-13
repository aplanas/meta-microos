SUMMARY = "Apache Maven parent POM"
DESCRIPTION = "Apache Maven parent POM file used by other Maven projects."
LICENSE = "Apache-2.0"

PV = "40"

RPM_NAME = "maven-parent-40-1.1.noarch.rpm"
RPM_HASH = "ea032afbce78c2ce02723431c1fa2cb68790af3ad5a29340e31f78f12899de1cf07b5ae9d586451b1c144ecabd6a23eb971aa6eb8f83cee88af4df34f1bed081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-parent \
maven-plugins-pom \
maven-shared \
mvn-org.apache.maven-maven-parent-pom- \
mvn-org.apache.maven.doxia-doxia-tools-pom- \
mvn-org.apache.maven.extensions-maven-extensions-pom- \
mvn-org.apache.maven.plugins-maven-plugins-pom- \
mvn-org.apache.maven.shared-maven-shared-components-pom- \
mvn-org.apache.maven.skins-maven-skins-pom-"

RDEPENDS:${PN} += "apache-parent \
java-headless \
javapackages-filesystem"

inherit rpm
