SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "9001dc074dfd75e22909dd014ad98a7ab671eb8395e5766c3feccf94cd9f74f1ecec6981f14ff03c5a1560a07a6f8b8465b00ac3026ab219fff7d7b782a0cc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jacc-1_1-api jacc_1_1_api jacc_api mvn(org.apache.geronimo.specs:geronimo-jacc_1.1_spec) mvn(org.apache.geronimo.specs:geronimo-jacc_1.1_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem servlet_2_5_api update-alternatives"

inherit rpm
