SUMMARY = "Library for parsing XML DTDs"
DESCRIPTION = "Library for parsing XML DTDs."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-1.4-4.19.noarch.rpm"
RPM_HASH = "d124f0d4d2aaddb2a4f5f37b780431e558f835845f8b9e1a4d6eddf0353957cc9fbd90e2f9fe2cb0c3a434589aee98a5467f8b8d39586a745960b43d71ac61f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser \
mvn-com.sun.xml.dtd-parser-dtd-parser \
mvn-com.sun.xml.dtd-parser-dtd-parser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
