SUMMARY = "JAXB Runtime parent POM"
DESCRIPTION = "This package contains Runtime parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-parent-2.3.1-4.5.noarch.rpm"
RPM_HASH = "b4b94e6e08cc7b29b5701a4e95a440be12b2e719c06f35c1f99bad25a3572ac0e2bf8afc3f7658f56a366ea8c85e0252bce7ea42209cfaff8afc25dfbebff974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-runtime-parent \
mvn-com.sun.xml.bind.mvn-jaxb-runtime-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
