SUMMARY = "Optional apache oro tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache oro tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-oro-1.10.13-2.1.noarch.rpm"
RPM_HASH = "c86cbb79422932d7d41e07dac0b5dc4fefeef659cc2c6593278939d2b3f0962dc19b7bacbe0da2d33dac56c9648163b48bb9ba03c79d5efaff21170bcff6a4c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-oro \
ant-jakarta-oro \
config(ant-apache-oro) \
mvn(org.apache.ant:ant-apache-oro) \
mvn(org.apache.ant:ant-apache-oro:pom:)"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn(org.apache.ant:ant) \
mvn(oro:oro) \
oro"

inherit rpm
