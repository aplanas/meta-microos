SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit5 tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-junit5-1.10.14-1.1.noarch.rpm"
RPM_HASH = "71b30378c1e67dd64f01805c430c34a62ccdbc14d4fbde028b4f15466133545aec58dc4cfbf11f55507029a647f7f3d61ee4f1c35166cfbc30c57b37a5871768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit5 \
config-ant-junit5 \
mvn-org.apache.ant-ant-junitlauncher \
mvn-org.apache.ant-ant-junitlauncher-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit5 \
mvn-org.apache.ant-ant \
mvn-org.junit.platform-junit-platform-launcher"

inherit rpm
