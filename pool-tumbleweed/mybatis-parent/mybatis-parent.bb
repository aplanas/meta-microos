SUMMARY = "The MyBatis parent POM"
DESCRIPTION = "The MyBatis parent POM which has to be inherited by all MyBatis modules."
LICENSE = "Apache-2.0"

PV = "31"

RPM_NAME = "mybatis-parent-31-2.4.noarch.rpm"
RPM_HASH = "26f4b03839c883b025aadf718b66269351b4cbddb67ce47058ce3aeac75af6343b5785efcbebe8fb28932b0cc2c61c9942d8f1f262c5438ce60e17fdd3b54d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mybatis-mybatis-parent-pom- \
mybatis-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.wagon-wagon-ssh"

inherit rpm
