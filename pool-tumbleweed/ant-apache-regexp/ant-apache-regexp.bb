SUMMARY = "Optional apache regexp tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache regexp tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-regexp-1.10.13-2.1.noarch.rpm"
RPM_HASH = "2fa0611b0ebed8a3372e80e825f554eb14539c548d521531fe9413cf0afe6b311d3bc5fbc0a88f562cf735b6c8ae23d4ad1a6fbfa4c18e2dff441698c0ec9c0c"
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
