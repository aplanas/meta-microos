SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-interceptor-3_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "c489232cf61f15321861fcc26015acc08db9305d70bb37a8a68b761f636ea99f71aadf141f4a6224bcbd8932e4aa874128c632b8cc798b9239d1661ca33e9c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-interceptor-3_0-api \
interceptor_3_0_api \
interceptor_api \
mvn(org.apache.geronimo.specs:geronimo-interceptor_3.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-interceptor_3.0_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
