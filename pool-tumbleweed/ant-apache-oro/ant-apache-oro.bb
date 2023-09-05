SUMMARY = "Optional apache oro tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache oro tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-oro-1.10.14-1.1.noarch.rpm"
RPM_HASH = "cea5d1be78ad8cda99b371090bcc864d85e3abeed26b46a6533c0428d7a2956c13c1b38a8520bb4bef1cc46ca54bdbbeb6aa3cabe357d477547e36eb77a3d2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-oro \
ant-jakarta-oro \
config-ant-apache-oro \
mvn-org.apache.ant-ant-apache-oro \
mvn-org.apache.ant-ant-apache-oro-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-oro-oro \
oro"

inherit rpm
