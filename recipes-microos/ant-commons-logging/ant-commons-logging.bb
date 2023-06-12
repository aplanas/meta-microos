SUMMARY = "Optional commons logging tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons logging tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-commons-logging-1.10.13-2.1.noarch.rpm"
RPM_HASH = "03f58525285b2304488b660607e990332f0b7c141c4efecc09df227b924d81ea2381490f3930f012860a2bead109f9d8584492275c1e495c08781beb5d23083f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-logging \
config(ant-commons-logging) \
mvn(org.apache.ant:ant-commons-logging) \
mvn(org.apache.ant:ant-commons-logging:pom:)"
RDEPENDS:${PN} += "ant \
apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn(commons-logging:commons-logging-api) \
mvn(org.apache.ant:ant)"

inherit rpm
