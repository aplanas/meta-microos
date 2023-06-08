SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 1.0 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-1_0-apis-1.2-36.11.noarch.rpm"
RPM_HASH = "a04476403702b46233e04c1230f10ea2ab9f3eb111b9672b4a07c58d16cbcdcbe1f059b31d60914f0e929ba59a9543b67f2aaa4ed8aa62870cfa05e0251f5822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba_1_0_apis corba_apis geronimo-corba-1_0-apis mvn(org.apache.geronimo.specs:geronimo-spec-corba) mvn(org.apache.geronimo.specs:geronimo-spec-corba:pom:)"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem"

inherit rpm
