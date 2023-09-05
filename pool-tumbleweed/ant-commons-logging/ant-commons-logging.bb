SUMMARY = "Optional commons logging tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons logging tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-commons-logging-1.10.14-1.1.noarch.rpm"
RPM_HASH = "e434e2cde5602deafb8c92d8845e5c84dce026119a1a64ab367a95c88aec0afbe2bb86f4f6bb06a0e9ac09509de19e386caf6a6a5bd575953574cc3514b84ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-logging \
config-ant-commons-logging \
mvn-org.apache.ant-ant-commons-logging \
mvn-org.apache.ant-ant-commons-logging-pom-"

RDEPENDS:${PN} += "ant \
apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging-api \
mvn-org.apache.ant-ant"

inherit rpm
