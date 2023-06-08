SUMMARY = "Optional swing tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional swing tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-swing-1.10.13-2.1.noarch.rpm"
RPM_HASH = "4e46d6f1668eb75d7dcff3ab86c9670a76a3b0f166d9ff67a11b04fdc507f8113f6f28dc29c13a4a128dd88547eae062db2fc70e4d6de33843ca0938c89fe831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-swing config(ant-swing) mvn(org.apache.ant:ant-swing) mvn(org.apache.ant:ant-swing:pom:)"
RDEPENDS:${PN} += "ant java-headless javapackages-filesystem mvn(org.apache.ant:ant)"

inherit rpm
