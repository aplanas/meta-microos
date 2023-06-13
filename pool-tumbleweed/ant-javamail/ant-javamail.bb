SUMMARY = "Optional javamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional javamail tasks for Apache Ant."
LICENSE = "CDDL-1.0"

PV = "1.10.13"

RPM_NAME = "ant-javamail-1.10.13-2.1.noarch.rpm"
RPM_HASH = "53b2f95f97e01eb6c7b64ff31768d2e14464710272686fa8c553820409e7d3e21afeb18d55637c3b16c5009d6b32249c7924ddcccafdab5dadc18ee61492a0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-javamail \
config(ant-javamail) \
mvn(org.apache.ant:ant-javamail) \
mvn(org.apache.ant:ant-javamail:pom:)"

RDEPENDS:${PN} += "ant \
java-headless \
javamail \
javapackages-filesystem \
mvn(com.sun.mail:javax.mail) \
mvn(org.apache.ant:ant)"

inherit rpm
