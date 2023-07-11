SUMMARY = "Maven Install Plugin"
DESCRIPTION = "Copies the project artifacts to the user's local repository."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "maven-install-plugin-3.1.1-1.2.noarch.rpm"
RPM_HASH = "c7cedb6a1cc1f5a13b018163b205a8c3b0b519514d75dd329dca15a5de89e7940b0ea57338f6e541de769f373641bbd059a3eff2b7a424dc301197b64ac2118a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin \
mvn-org.apache.maven.plugins-maven-install-plugin \
mvn-org.apache.maven.plugins-maven-install-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.aether-aether-util"

inherit rpm
