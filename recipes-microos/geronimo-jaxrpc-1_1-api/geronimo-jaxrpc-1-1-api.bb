SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML-Based RPC (JAXRPC)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxrpc-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "318865499c6fc9e2f7ab196368c65a2d4e71cf570fa297ee5163047e39317583bc4a0f04ef4833f85b0f4b31910da52d954273a874360747442cd7af4d35482e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxrpc-1_1-api \
jaxrpc \
jaxrpc_1_1_api \
jaxrpc_api \
mvn(org.apache.geronimo.specs:geronimo-jaxrpc_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-jaxrpc_1.1_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
qname_1_1_api \
saaj_1_1_api \
servlet_2_4_api \
update-alternatives"

inherit rpm
