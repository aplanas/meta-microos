SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_5-api-1.2-36.11.noarch.rpm"
RPM_HASH = "cd8e06b44ff38acaf0fc73a912c6bb9f61ad7c27541d403f7e3f8c69c6a34577a800e4df3e28712919300e724f0bb47feec3a2c9443517d9f6bd2828d7added9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2_5-api mvn(org.apache.geronimo.specs:geronimo-servlet_2.5_spec) mvn(org.apache.geronimo.specs:geronimo-servlet_2.5_spec:pom:) servlet servlet_2_5_api servlet_api"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem update-alternatives"

inherit rpm
