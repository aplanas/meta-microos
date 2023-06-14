SUMMARY = "Plugin to sign/verify a project artifact and attachments using jarsigner"
DESCRIPTION = "This plugin provides the capability to sign or verify \
a project artifact and attachments using jarsigner. \
 \
If you need to sign a project artifact and all attached artifacts, \
just configure the sign goal appropriately in your pom.xml \
for the signing to occur automatically during the package phase. \
 \
If you need to verify the signatures of a project artifact \
and all attached artifacts, just configure the verify goal \
appropriately in your pom.xml for the verification to occur \
automatically during the verify phase."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-jarsigner-plugin-3.0.0-3.21.noarch.rpm"
RPM_HASH = "5d658ea2ee38b5cc5b41f2eec321512593d793744f3198e1a33ba428c9da00f6930035ee5188dd9b09ac51758313a4d0dd1d955506875d7f09ceb946763d2931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jarsigner-plugin \
mvn-org.apache.maven.plugins-maven-jarsigner-plugin \
mvn-org.apache.maven.plugins-maven-jarsigner-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.shared-maven-jarsigner \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.sonatype.plexus-plexus-sec-dispatcher"

inherit rpm
