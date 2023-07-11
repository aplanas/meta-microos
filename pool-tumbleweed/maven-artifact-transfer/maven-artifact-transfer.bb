SUMMARY = "Apache Maven Artifact Transfer"
DESCRIPTION = "An API to either install or deploy artifacts with Maven 3."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-0.13.1-1.9.noarch.rpm"
RPM_HASH = "c907652cb9d5b83d9f7f7b73003b54b5f12955291995d06f8664ebc73fd6cfdb576d126164162bc4fe103b83bc5ec71341b2e805d6d0097fc39b9a657baca495"
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
