SUMMARY = "Codemodel parent POM"
DESCRIPTION = "This package contains codemodel parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-codemodel-parent-2.3.1-4.5.noarch.rpm"
RPM_HASH = "8c9fed5156ed891fc6781eea25249f2bc1195cacc34ec75059d2911e2a1d147485be4a5e096e17e708a0cd0d44e7c0f5e8fc31fecc3b151366d57dccef978f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-codemodel-parent \
mvn-com.sun.xml.bind.mvn-jaxb-codemodel-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
