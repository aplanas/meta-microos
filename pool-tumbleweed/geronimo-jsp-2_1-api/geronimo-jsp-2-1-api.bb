SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "5ba871fc2b9337678ef44b9dd0cd005249f0f09b424dce00c922c01750959e3f3786fc5b748d601f3f22af6bd3e283ad64283030ce82bcf1be0932d4f7f8bb6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2_1-api \
jsp \
jsp_2_1_api \
jsp_api \
mvn(org.apache.geronimo.specs:geronimo-jsp_2.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-jsp_2.1_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
el_1_0_api \
java-headless \
javapackages-filesystem \
servlet_2_5_api \
update-alternatives"

inherit rpm
