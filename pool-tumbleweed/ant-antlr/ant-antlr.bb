SUMMARY = "Antlr Task for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-antlr-1.10.14-1.1.noarch.rpm"
RPM_HASH = "6b596cf5d44da985e24c86782c6f47fb1297d229a764059033c6d57dfbabee07feb37d057a33a934172572cbc3ba0738d1dcc22bf709dffdf249f5bb70ecb9e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-antlr \
config-ant-antlr \
mvn-org.apache.ant-ant-antlr \
mvn-org.apache.ant-ant-antlr-pom-"

RDEPENDS:${PN} += "ant \
antlr \
java-headless \
javapackages-filesystem"

inherit rpm
