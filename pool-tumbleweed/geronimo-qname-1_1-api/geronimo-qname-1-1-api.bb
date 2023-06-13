SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: javax.xml.namespace.QName API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-qname-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "3b7191915d87f6cc25222f128f05edfbc3f500ba0732e67ce0393d2e1c360993f5b895118d277e239130fcd83ca4088e9707541d4d0c53b402d227772e41c366"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-qname-1_1-api \
mvn(org.apache.geronimo.specs:geronimo-qname_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-qname_1.1_spec:pom:) \
qname_1_1_api \
qname_api"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
