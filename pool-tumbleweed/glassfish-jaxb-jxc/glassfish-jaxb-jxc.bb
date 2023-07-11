SUMMARY = "JAXB schema generator"
DESCRIPTION = "The tool to generate XML schema based on java classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-jxc-2.3.1-4.5.noarch.rpm"
RPM_HASH = "202dcf80c95bfe5918a8135c78ffd2787aacacad3b5bf47a248b11102fc5b87ce30ff7dd0d39535af85c615fac75a26302810307579b2764fcffa51c19a58a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-jxc \
mvn-org.glassfish.jaxb-jaxb-jxc \
mvn-org.glassfish.jaxb-jaxb-jxc-jdk9 \
mvn-org.glassfish.jaxb-jaxb-jxc-jdk9-pom- \
mvn-org.glassfish.jaxb-jaxb-jxc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.istack-istack-commons-runtime \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-jaxb-xjc \
mvn-org.glassfish.jaxb-txw2"

inherit rpm
