SUMMARY = "Optional jdepend tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jdepend tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jdepend-1.10.13-2.2.noarch.rpm"
RPM_HASH = "cbfb731a00a481bcc1177b8dda492d6acbf04e9a295511babc3ca9d2d9e410e1f40be3b924a6e8376166e364fa73f23b516a967717bc14132a7ca33f9b5e3862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jdepend \
config-ant-jdepend \
mvn-org.apache.ant-ant-jdepend \
mvn-org.apache.ant-ant-jdepend-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
jdepend \
mvn-jdepend-jdepend \
mvn-org.apache.ant-ant"

inherit rpm
