SUMMARY = "JAXB TXW parent POM"
DESCRIPTION = "This package contains TXW parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw-parent-2.3.1-4.5.noarch.rpm"
RPM_HASH = "75481ae29f02d5e916fd16f051e34ec1e3ed0988ccfb1b24fdf0951128cd386a143a35298bb54405d26889ef11a631fa9d5bc5dc1501b5f02235db2460dbea68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw-parent \
mvn-com.sun.xml.bind.mvn-jaxb-txw-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
