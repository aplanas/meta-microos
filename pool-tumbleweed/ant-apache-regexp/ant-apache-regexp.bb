SUMMARY = "Optional apache regexp tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache regexp tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-regexp-1.10.13-2.2.noarch.rpm"
RPM_HASH = "80b1ff2db0db07c7b455f1e2d0fb5fa66dda6edad78deb396f5b01bbe7eaf34baee143ee543452402f9afe02a8818bdaf2bba7db9531d1ac87a97ddad42e133d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-regexp \
ant-jakarta-regexp \
config-ant-apache-regexp \
mvn-org.apache.ant-ant-apache-regexp \
mvn-org.apache.ant-ant-apache-regexp-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-jakarta-regexp-jakarta-regexp \
mvn-org.apache.ant-ant \
regexp"

inherit rpm
