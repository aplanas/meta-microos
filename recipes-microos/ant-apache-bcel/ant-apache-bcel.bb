SUMMARY = "Optional apache bcel tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bcel tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-bcel-1.10.13-2.1.noarch.rpm"
RPM_HASH = "d074a96bf4a2d63102b56f5bf647286ac30558493e85abf677b598556fd20a61a535c34ca1fd63890553f5d91d84c474a00a32180ddfaa9833089b4fa99ab756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bcel ant-jakarta-bcel config(ant-apache-bcel) mvn(org.apache.ant:ant-apache-bcel) mvn(org.apache.ant:ant-apache-bcel:pom:)"
RDEPENDS:${PN} += "ant bcel java-headless javapackages-filesystem mvn(org.apache.ant:ant) mvn(org.apache.bcel:bcel)"

inherit rpm
