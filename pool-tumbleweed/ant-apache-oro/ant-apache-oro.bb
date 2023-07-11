SUMMARY = "Optional apache oro tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache oro tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-oro-1.10.13-2.2.noarch.rpm"
RPM_HASH = "16988c767b596262a3b9c5e25c354b87644f282fef032cdcb4e0ab7e1b94a812262436f17c279823723fc9d6a84432460af60fd10119c50e5a8ce3b9e02f9984"
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
