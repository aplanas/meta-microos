SUMMARY = "Optional jakartamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jakartamail tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-jakartamail-1.10.14-1.1.noarch.rpm"
RPM_HASH = "a263efeb1d71da03309628e6c58c8c56793056dad9be74e50982d7b45881ed4787be67e00ede7cfd3e86d695ab2975d968cc239f4d0af1d2e0725dabc4c03e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jakartamail \
config-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail-pom-"

RDEPENDS:${PN} += "ant \
jakarta-mail \
java-headless \
javapackages-filesystem \
mvn-com.sun.mail-jakarta.mail \
mvn-org.apache.ant-ant"

inherit rpm
