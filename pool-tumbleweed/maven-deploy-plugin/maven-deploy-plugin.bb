SUMMARY = "Maven Deploy Plugin"
DESCRIPTION = "Uploads the project artifacts to the internal remote repository."
LICENSE = "Apache-2.0"

PV = "3.0.0~M2"

RPM_NAME = "maven-deploy-plugin-3.0.0~M2-1.9.noarch.rpm"
RPM_HASH = "9d334c08d940a38b413638e4e3e20fc0a6742522d857358978c1031caf76523c701887924fbfcf29901523e17a3f7760f97fdf58af0b32fad75ca7e9a845479e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin \
mvn-org.apache.maven.plugins-maven-deploy-plugin \
mvn-org.apache.maven.plugins-maven-deploy-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.aether-aether-api \
mvn-org.eclipse.aether-aether-util"

inherit rpm
