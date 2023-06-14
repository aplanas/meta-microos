SUMMARY = "Apache Maven Artifact Transfer"
DESCRIPTION = "An API to either install or deploy artifacts with Maven 3."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-0.13.1-1.8.noarch.rpm"
RPM_HASH = "2c3211e3c0e81dcef1eaa06f465e1f181b8be044e33db339cf7ff604a7fe6926a5f9474c569526c8b3142561e69996a3a7f4347ea10c19881fcd19026032e230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-artifact-transfer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.aether-aether-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
