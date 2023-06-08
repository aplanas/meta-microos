SUMMARY = "Optional jmf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jmf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jmf-1.10.13-2.1.noarch.rpm"
RPM_HASH = "9a48b2b19bcb1774677c30dc520e500f2147902cf75cbe4a4e21c22d57260937042fa0a16273e9a564f8b7f7492cf7c0b79a784605b5eab1843aa4bc53312776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jmf config(ant-jmf) mvn(org.apache.ant:ant-jmf) mvn(org.apache.ant:ant-jmf:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem mvn(org.apache.ant:ant)"

inherit rpm
