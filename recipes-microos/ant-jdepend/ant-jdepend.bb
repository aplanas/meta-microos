SUMMARY = "Optional jdepend tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jdepend tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jdepend-1.10.13-2.1.noarch.rpm"
RPM_HASH = "996e0704c85abb1e5d6095c5ea512fccb40c5bc1bb1c8c01dd9f3ae1eeca71228ec5c8cadeab74a14688fd9510406cdc00d83e938a8003fb9a92a5f9593cff7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jdepend config(ant-jdepend) mvn(org.apache.ant:ant-jdepend) mvn(org.apache.ant:ant-jdepend:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem jdepend mvn(jdepend:jdepend) mvn(org.apache.ant:ant)"

inherit rpm
