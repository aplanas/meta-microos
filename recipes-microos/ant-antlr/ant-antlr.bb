SUMMARY = "Antlr Task for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-antlr-1.10.13-2.1.noarch.rpm"
RPM_HASH = "3fd52e77be48198cc47d293f2eb66d792484b71bc547da215836d8387422f13523dcb934fb1d6bae03b933ffdd1781a74e014cc6a37baf2f754b57b29bf2b17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-antlr config(ant-antlr) mvn(org.apache.ant:ant-antlr) mvn(org.apache.ant:ant-antlr:pom:)"
RDEPENDS:${PN} += "ant antlr java-headless javapackages-filesystem"

inherit rpm
