SUMMARY = "Jakarta Commons Digester Package"
DESCRIPTION = "The goal of the Jakarta Commons Digester project is to create and \
maintain an XML to Java object mapping package written in the Java \
language to be distributed under the ASF license."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "apache-commons-digester-2.1-4.7.noarch.rpm"
RPM_HASH = "e187d63fc5ebd8635ba38b6707a7b37b66677ad486cad62dd925a74a652cf156879e971ebc9d656e58b407b99dafb12b5a2d70d490699cca19820017de23d12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-digester \
commons-digester \
jakarta-commons-digester \
mvn-commons-digester-commons-digester \
mvn-commons-digester-commons-digester-pom- \
mvn-org.apache.commons-commons-digester \
mvn-org.apache.commons-commons-digester-pom- \
osgi-org.apache.commons.commons-digester"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-logging-commons-logging"

inherit rpm
