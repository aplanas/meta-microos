SUMMARY = "Sisu plugin for Apache Maven"
DESCRIPTION = "The Sisu Plugin for Maven provides mojos to generate \
META-INF/sisu/javax.inject.Named index files for the Sisu container."
LICENSE = "EPL-1.0"

PV = "0.3.1"

RPM_NAME = "sisu-mojos-0.3.1-1.2.noarch.rpm"
RPM_HASH = "52474f361e50b43f129efbeffffe288c02b5cf1a45fc330969de8c2273c18794073024d4a0ef1f19d3fbad036a16274be16a236e37eef04c558b24728784563f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-sisu-maven-plugin \
mvn-org.eclipse.sisu-sisu-maven-plugin-pom- \
mvn-org.sonatype.plugins-sisu-maven-plugin \
mvn-org.sonatype.plugins-sisu-maven-plugin-pom- \
sisu-mojos"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.slf4j-slf4j-nop"

inherit rpm
