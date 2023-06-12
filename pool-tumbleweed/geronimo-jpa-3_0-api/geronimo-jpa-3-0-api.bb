SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jpa-3_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "83a4ee7339358914d6f73692444f1b26d1742473d9c94db08e3b83175c5cbb0e528bfd1ee649181b5077a01c97f21399f95fd3ccd9c0eb921df3e4b2b5bcf0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jpa-3_0-api \
jpa_3_0_api \
jpa_api \
mvn(javax.persistence:persistence-api) \
mvn(javax.persistence:persistence-api:pom:) \
mvn(org.apache.geronimo.specs:geronimo-jpa_3.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-jpa_3.0_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
