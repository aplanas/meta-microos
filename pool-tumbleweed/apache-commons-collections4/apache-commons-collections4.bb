SUMMARY = "Extension of the Java Collections Framework"
DESCRIPTION = "Commons-Collections seek to build upon the JDK classes by providing \
new interfaces, implementations and utilities."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "apache-commons-collections4-4.1-2.7.noarch.rpm"
RPM_HASH = "aa47713fd8e0b4d8e4c1744bc93db962a02180bbe05857f96f1d52f20121e3d86126316b397577ac4d2fc179c558f0b4080c5dd34c71df4b18e73ce67f70f8a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4 \
mvn-org.apache.commons-commons-collections4 \
mvn-org.apache.commons-commons-collections4-pom- \
osgi-org.apache.commons.commons-collections4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
