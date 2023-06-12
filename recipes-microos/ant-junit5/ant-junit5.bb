SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit5 tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-junit5-1.10.13-2.1.noarch.rpm"
RPM_HASH = "2bf73219de9083cd024ec8caffc72978d96126923a5937b147b44b80d6e19b7cab98236df465b2a0ea31d090c238697328aafd5d455beb72ac38f0ba11eec5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit5 \
config(ant-junit5) \
mvn(org.apache.ant:ant-junitlauncher) \
mvn(org.apache.ant:ant-junitlauncher:pom:)"
RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit5 \
mvn(org.apache.ant:ant) \
mvn(org.junit.platform:junit-platform-launcher)"

inherit rpm
