SUMMARY = "Optional apache resolver tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache resolver tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-resolver-1.10.14-1.1.noarch.rpm"
RPM_HASH = "958a256374560c4a0103091ce514f4ce92ec7a269e74dd580ff84432aef639a9d7f7f7b4564b6757471976054e2a83f4a0c578ba45720b5cd812b9b22764c91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-resolver \
config-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xml-resolver-xml-resolver \
xml-resolver"

inherit rpm
