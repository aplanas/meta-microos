SUMMARY = "Opional xz tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional xz tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-xz-1.10.13-2.1.noarch.rpm"
RPM_HASH = "a6692d0a083757841c2dcfa3ce5739b326038c16c2867f90a59bbe26073373f7fdc1c892cc5e9bc0bd48b703d563e22bfd82d735e4c609f7279a0ec797054990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-xz \
config(ant-xz) \
mvn(org.apache.ant:ant-xz) \
mvn(org.apache.ant:ant-xz:pom:)"
RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(org.tukaani:xz) \
xz-java"

inherit rpm
