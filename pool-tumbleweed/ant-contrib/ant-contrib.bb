SUMMARY = "Collection of tasks for Ant"
DESCRIPTION = "The Ant-Contrib project is a collection of tasks (and at one point \
maybe types and other tools) for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-1.0b3-10.4.noarch.rpm"
RPM_HASH = "061cfe7fd5675a83240d0a0883e2beab8037d5ece05d9485a646e5e3eff9fe216390f4832bfe315e24ac51385c34ee33ae5d474006c6c605e1ae7ad7fe55a301"
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
