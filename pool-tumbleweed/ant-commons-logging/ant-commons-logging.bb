SUMMARY = "Optional commons logging tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons logging tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-commons-logging-1.10.13-2.2.noarch.rpm"
RPM_HASH = "f9b226cc6998788a6f59786f397192f08af849e91699f5492cd2108fc508c8676217739477e1af31b64745ffcac27a40104285738fb5c2f85b1e41fe0dc400cc"
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
