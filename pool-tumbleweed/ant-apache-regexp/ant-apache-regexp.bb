SUMMARY = "Optional apache regexp tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache regexp tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-apache-regexp-1.10.14-1.1.noarch.rpm"
RPM_HASH = "89b091454ca9cae249da1c82a0fae0490576ef1974ca1c7a91524fe16d758b1a6e751ef29276c2f34a2ba9369f82e455924c7d5134347d1d706b93e39d4b9dca"
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
