SUMMARY = "Apache Maven Artifact Transfer"
DESCRIPTION = "An API to either install or deploy artifacts with Maven 3."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-0.13.1-2.1.noarch.rpm"
RPM_HASH = "53d15aa44df82e31cbadb67209506fadda5a70339eeafc89aa721469b11dd3192844b3195756c4bc406a1802dc58ad5770841b0897ac99dae4905b79ca0ccc26"
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
