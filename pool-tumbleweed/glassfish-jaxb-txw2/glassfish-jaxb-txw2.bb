SUMMARY = "TXW2 Runtime"
DESCRIPTION = "TXW is a library that allows you to write XML documents."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw2-2.3.1-4.4.noarch.rpm"
RPM_HASH = "a3b4d27a74ddc1e887ea9d77028fb799d54a310d826079927ded7f50dc13d415584c796ff180fb7e9695718e7d5ef0a000c1cb5778a120c42733b350999c1c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.glassfish.jaxb-txw2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
