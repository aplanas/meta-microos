SUMMARY = "Java-based build tool"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-1.10.14-1.1.noarch.rpm"
RPM_HASH = "95960be21c65e60b789f6cf2e7da2969aead8fea9fa71944be9282211fcb6ff0756096f5b46261caeb59f4626bb451684fdadc6403fca54c09f4a0151d5719ee"
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
