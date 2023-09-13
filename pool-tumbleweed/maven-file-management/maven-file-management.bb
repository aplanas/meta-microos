SUMMARY = "Maven File Management API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-file-management-3.0.0-4.1.noarch.rpm"
RPM_HASH = "90d4d45d332648dc75e4e19133a99ee9c04f3e6280f8a734d03a6b6ce24b81c2efd87cf781a434d6df4c9db989ce905a434176e69bcbf3840967ed7b43c1bdf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-file-management-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-io \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
