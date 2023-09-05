SUMMARY = "Optional jmf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jmf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-jmf-1.10.14-1.1.noarch.rpm"
RPM_HASH = "697493263c1718af74d0e634c90a20fd4057aecacc8f8881caea3ac3e596704af26686653a6ef0532832881a3c8953adc7ff6101f0c3308ec16607f124b6e57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jmf \
config-ant-jmf \
mvn-org.apache.ant-ant-jmf \
mvn-org.apache.ant-ant-jmf-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
