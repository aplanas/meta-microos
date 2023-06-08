SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-junit-1.10.13-2.1.noarch.rpm"
RPM_HASH = "031a4a49f1f9e03be95695b8cd361baacafc2e5140efc09967518255b7c96a974db9070c99ba33fb1cb64c770d61b2abb03e21d64a121b3591bf588b0c3b775d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit config(ant-junit) mvn(org.apache.ant:ant-junit) mvn(org.apache.ant:ant-junit4) mvn(org.apache.ant:ant-junit4:pom:) mvn(org.apache.ant:ant-junit:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem junit4 mvn(junit:junit) mvn(org.apache.ant:ant)"

inherit rpm
