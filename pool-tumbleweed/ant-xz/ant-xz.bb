SUMMARY = "Opional xz tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional xz tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-xz-1.10.13-2.2.noarch.rpm"
RPM_HASH = "bc749e6f724a683fb946ec7daeb292836bb9a6ad3c71c8695a2233b5d07dc96c8388c639b9993113601764fca8ec76f363a3c4136bb71ffd448c300e3f56d5bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-xz \
config-ant-xz \
mvn-org.apache.ant-ant-xz \
mvn-org.apache.ant-ant-xz-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.tukaani-xz \
xz-java"

inherit rpm
