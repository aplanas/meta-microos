SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_5-api-1.2-36.12.noarch.rpm"
RPM_HASH = "a8b85823769ec090c6b2691dc37ce08e0d3f43bf6531c40d7e925a225bbc97a7cbcf8b10bb4ed7ef65b69ead0d8d48fc3cf5a5a48c01064f7a429568d5841cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-5-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.5-spec-pom- \
servlet \
servlet-2-5-api \
servlet-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
