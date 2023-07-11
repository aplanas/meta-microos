SUMMARY = "Build Helper Maven Plugin"
DESCRIPTION = "This plugin contains various small independent goals to assist with \
Maven build lifecycle."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "maven-plugin-build-helper-3.2.0-2.9.noarch.rpm"
RPM_HASH = "6a70e1b21236101e717f2302f845756e763b7db579fa4cb7a19a7068d905989597156c6b6b3dcdd0743fe2feb28d68861aa1442c0d41724a7c5a76dcd111025a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-build-helper \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
