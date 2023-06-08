SUMMARY = "Collection of tasks for Ant"
DESCRIPTION = "The Ant-Contrib project is a collection of tasks (and at one point \
maybe types and other tools) for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-1.0b3-10.3.noarch.rpm"
RPM_HASH = "b62bfc52145f0cfd6d9de63c104937ad6e5b323f964d23bfa479c9948f03d0f2870997f5c75422e66d80108552f7574403773b351cbcb73625f94dc10f768fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib config(ant-contrib) mvn(ant-contrib:ant-contrib) mvn(ant-contrib:ant-contrib:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem junit mvn(org.apache.ant:ant) xerces-j2"

inherit rpm
