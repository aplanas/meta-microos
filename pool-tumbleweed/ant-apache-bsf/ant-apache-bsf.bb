SUMMARY = "Optional apache bsf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bsf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-bsf-1.10.13-2.2.noarch.rpm"
RPM_HASH = "62c063d6f2fbc56487e9f2ce290e2ce8f30ea9cb7e8778d9f5d4c91d42e8ab69ff6004d727e97f10fb3da5fc36aeba09865fa134cf5f6f49ed08b0ae9f4bf0ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bsf \
config-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf-pom-"

RDEPENDS:${PN} += "ant \
bsf \
java-headless \
javapackages-filesystem \
mvn-bsf-bsf \
mvn-org.apache.ant-ant"

inherit rpm
