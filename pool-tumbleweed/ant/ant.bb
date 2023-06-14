SUMMARY = "Java-based build tool"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-1.10.13-2.1.noarch.rpm"
RPM_HASH = "6c0cfb5355fdb65d35b64d9cef0c2cf90c40ddb31593042794c227215ee0314ec8f84039554b6c783e59c500cc26070cca3cf62f6ea0b01a347c96d76c23e9f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant \
ant-nodeps \
ant-trax \
apache-ant \
config-ant \
mvn-ant-ant \
mvn-ant-ant-launcher \
mvn-ant-ant-launcher-pom- \
mvn-ant-ant-pom- \
mvn-apache-ant \
mvn-apache-ant-pom- \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-bootstrap \
mvn-org.apache.ant-ant-bootstrap-pom- \
mvn-org.apache.ant-ant-launcher \
mvn-org.apache.ant-ant-launcher-pom- \
mvn-org.apache.ant-ant-nodeps \
mvn-org.apache.ant-ant-nodeps-pom- \
mvn-org.apache.ant-ant-pom-"

RDEPENDS:${PN} += "java-devel \
java-headless \
javapackages-filesystem \
javapackages-tools \
xerces-j2 \
xml-apis \
xml-resolver"

inherit rpm
