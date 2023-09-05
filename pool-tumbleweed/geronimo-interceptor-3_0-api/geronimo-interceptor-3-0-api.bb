SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-interceptor-3_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "e2a600ccdaa099874aaeb00e0c05c5d998e415a988914c785d818c64194f9ae9f97e73f98ee5b0f4b615c1a7081fbc22032ea518ea36faffb64a80acc041bb77"
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
