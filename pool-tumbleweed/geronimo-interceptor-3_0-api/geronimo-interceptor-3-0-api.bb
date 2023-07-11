SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-interceptor-3_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "1290ee22d12810569688392c6401038c14064ac12efaba711ea8db6744b431bcc350834cd706cad5401e9e460403d2e560fb03790b2ad2966fa8a8d736968303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-interceptor-3-0-api \
interceptor-3-0-api \
interceptor-api \
mvn-org.apache.geronimo.specs-geronimo-interceptor-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-interceptor-3.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
