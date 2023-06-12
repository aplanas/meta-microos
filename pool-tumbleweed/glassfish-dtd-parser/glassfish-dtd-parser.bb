SUMMARY = "Library for parsing XML DTDs"
DESCRIPTION = "Library for parsing XML DTDs."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "1.4"

RPM_NAME = "glassfish-dtd-parser-1.4-4.18.noarch.rpm"
RPM_HASH = "fc6e05a30f01d30589ebd51b32df756de3de4135548f96a74727ae2e126f55d5d30479bf5f01b3320735d1319f71bcc103486bba4eedcccc0aaf181ed4136506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-dtd-parser \
mvn(com.sun.xml.dtd-parser:dtd-parser) \
mvn(com.sun.xml.dtd-parser:dtd-parser:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
