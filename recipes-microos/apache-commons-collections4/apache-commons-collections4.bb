SUMMARY = "Extension of the Java Collections Framework"
DESCRIPTION = "Commons-Collections seek to build upon the JDK classes by providing \
new interfaces, implementations and utilities."
LICENSE = "Apache-2.0"

PV = "4.1"

RPM_NAME = "apache-commons-collections4-4.1-2.6.noarch.rpm"
RPM_HASH = "beb20379edd41be0e37f883b0d4140f6a847be28469a99844ff9862438a17669b4d52035200b32a3bfc2096f217f775803b6ab094ba7e56da995ff3b20d38ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections4 mvn(org.apache.commons:commons-collections4) mvn(org.apache.commons:commons-collections4:pom:) osgi(org.apache.commons.commons-collections4)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
