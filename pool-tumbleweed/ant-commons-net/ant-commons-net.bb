SUMMARY = "Optional commons net tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons net tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-commons-net-1.10.13-2.2.noarch.rpm"
RPM_HASH = "417656e2d17d6b3351bbe41b807cfb7d43c9c8a37ea7f047ce894ec3acc669abec936914d5a14dd7853fb09e159ba86a9f140b3a578118615a11c6e62d5c8206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-net \
config-ant-commons-net \
mvn-org.apache.ant-ant-commons-net \
mvn-org.apache.ant-ant-commons-net-pom-"

RDEPENDS:${PN} += "ant \
apache-commons-net \
java-headless \
javapackages-filesystem \
mvn-commons-net-commons-net \
mvn-org.apache.ant-ant"

inherit rpm
