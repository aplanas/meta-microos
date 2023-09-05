SUMMARY = "Collection of tasks for Ant"
DESCRIPTION = "The Ant-Contrib project is a collection of tasks (and at one point \
maybe types and other tools) for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-1.0b3-10.5.noarch.rpm"
RPM_HASH = "e03b314850ccef0b5004d35c43886084021d8519eca9fa3d0f175d4d26db67d4251c180dfb1b890fa0c25f411c58d6f1593d3dacb9207697f3b8a34488cbcbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib \
config-ant-contrib \
mvn-ant-contrib-ant-contrib \
mvn-ant-contrib-ant-contrib-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit \
mvn-org.apache.ant-ant \
xerces-j2"

inherit rpm
