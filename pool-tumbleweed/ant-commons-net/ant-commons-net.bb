SUMMARY = "Optional commons net tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons net tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-commons-net-1.10.13-2.1.noarch.rpm"
RPM_HASH = "76a322e0b734cc245fd81555678dba04f62a93bcacb6e3d28ef4bfbd87a4f084c7d34c8554e6380bb2a8692f7f2ba004a6bebce98d3628cdb72689e3855067bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-net \
config(ant-commons-net) \
mvn(org.apache.ant:ant-commons-net) \
mvn(org.apache.ant:ant-commons-net:pom:)"

RDEPENDS:${PN} += "ant \
apache-commons-net \
java-headless \
javapackages-filesystem \
mvn(commons-net:commons-net) \
mvn(org.apache.ant:ant)"

inherit rpm
