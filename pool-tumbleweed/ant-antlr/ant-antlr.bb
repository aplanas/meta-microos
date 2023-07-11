SUMMARY = "Antlr Task for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-antlr-1.10.13-2.2.noarch.rpm"
RPM_HASH = "62f890bc470724a45f5051880fde43ddefd5424065d1a495334d5fab4ca5c748f0b5743ca212df3835dba4ccf36192df6bf6befd4431f6ac1442642f80eae877"
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
