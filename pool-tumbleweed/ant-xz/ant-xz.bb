SUMMARY = "Opional xz tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional xz tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-xz-1.10.14-1.1.noarch.rpm"
RPM_HASH = "1e7d7df01e8d50cafc4dd0f2c27b2fe39ff2c3ce01fee5da87d91eb1cd9981aa7dc712b90a37ca85f5b629e35e5853532128043c00f488cbfae6789a1de6aa28"
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
