SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: SOAP with Attachments API for Java (SAAJ)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-saaj-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "ca93e2746f1fb036b57752959524ff2a4dde5131960fa6aea2149f30e10be2487b90df94e17870aca67bc12403d713123439c69c495cedcc0a404db6667b9b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-saaj-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec-pom- \
saaj \
saaj-1-1-api \
saaj-api"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
