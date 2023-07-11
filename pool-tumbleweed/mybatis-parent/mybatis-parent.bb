SUMMARY = "The MyBatis parent POM"
DESCRIPTION = "The MyBatis parent POM which has to be inherited by all MyBatis modules."
LICENSE = "Apache-2.0"

PV = "31"

RPM_NAME = "mybatis-parent-31-2.5.noarch.rpm"
RPM_HASH = "a80ac3d5e5156f74de788481ac1572e79d403fd35444835b650ac0de8e593596df5e513ebfbb14ff7523534063098daef1ba93bb3aa2dd6f0bc6d0bf72f6d0ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mybatis-mybatis-parent-pom- \
mybatis-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.wagon-wagon-ssh"

inherit rpm
