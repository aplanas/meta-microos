SUMMARY = "Optional jakartamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jakartamail tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-jakartamail-1.10.13-2.1.noarch.rpm"
RPM_HASH = "5ba02c8760d206ea2ec01e081fdab42cd333a5af0d4268a3e95ba05e76ae314f45e74da636949d1fe0be37edbd0263c6bbfc8e41c044611a4fdf13854dc2fe65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jakartamail \
config(ant-jakartamail) \
mvn(org.apache.ant:ant-jakartamail) \
mvn(org.apache.ant:ant-jakartamail:pom:)"

RDEPENDS:${PN} += "ant \
jakarta-mail \
java-headless \
javapackages-filesystem \
mvn(com.sun.mail:jakarta.mail) \
mvn(org.apache.ant:ant)"

inherit rpm
