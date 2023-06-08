SUMMARY = "Optional apache log4j tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache log4j tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-apache-log4j-1.10.13-2.1.noarch.rpm"
RPM_HASH = "e676977c98866acfd114096992378a42057d17cb055b0dfb913d6261f56e04af9114bcf66b4d2b66e2ceaba93ffe0994885f6c06777899ba901348fc38d11919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-log4j ant-jakarta-log4j config(ant-apache-log4j) mvn(org.apache.ant:ant-apache-log4j) mvn(org.apache.ant:ant-apache-log4j:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem mvn(log4j:log4j) mvn(org.apache.ant:ant) reload4j"

inherit rpm
