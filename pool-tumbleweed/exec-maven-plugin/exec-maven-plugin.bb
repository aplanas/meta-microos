SUMMARY = "Exec Maven Plugin"
DESCRIPTION = "A plugin to allow execution of system and Java programs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "exec-maven-plugin-3.0.0-4.3.noarch.rpm"
RPM_HASH = "0e91aab518751e75c38b972304eaa2c247ddbfb5fc4075ced127a3e786961252af608e10ab0f9f9e67e79a0cb3e8715c4f572af312fd6b4ab7fa349add505636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exec-maven-plugin \
mvn-org.codehaus.mojo-exec-maven-plugin \
mvn-org.codehaus.mojo-exec-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
