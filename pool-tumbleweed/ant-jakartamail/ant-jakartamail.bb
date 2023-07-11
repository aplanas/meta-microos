SUMMARY = "Optional jakartamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jakartamail tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jakartamail-1.10.13-2.2.noarch.rpm"
RPM_HASH = "73842c9bd3a0f811352a30fe191e1cd8bc3ee315ac8af7cd9214695691632e3941e280d21741d3aed231f68f0a71021def33160d74db280e70035fda9b2523d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jakartamail \
config-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail-pom-"

RDEPENDS:${PN} += "ant \
jakarta-mail \
java-headless \
javapackages-filesystem \
mvn-com.sun.mail-jakarta.mail \
mvn-org.apache.ant-ant"

inherit rpm
