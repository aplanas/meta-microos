SUMMARY = "Exec Maven Plugin"
DESCRIPTION = "A plugin to allow execution of system and Java programs."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "exec-maven-plugin-3.0.0-4.4.noarch.rpm"
RPM_HASH = "054efe749feca5ee349cc505cabde7e00c7a984b60759e301e1b3cdc005e876d78c0a993c3506e80913883d5604d8dd5c8e5314755d5616c810d7c64e0f1b32c"
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
