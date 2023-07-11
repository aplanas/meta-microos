SUMMARY = "RELAX NG Object Model/Parser"
DESCRIPTION = "This package contains RELAX NG Object Model/Parser."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-rngom-2.3.1-4.5.noarch.rpm"
RPM_HASH = "46ac2f3403658200f9653858f3f8e16d6d83626fed4f8eb6734df75bfc3126849e26349380bb6695327d2d53c76625eb39d4d5427f43ca52584a7b4c2b19a7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-rngom \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.bind.external-rngom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.external-relaxng-datatype"

inherit rpm
