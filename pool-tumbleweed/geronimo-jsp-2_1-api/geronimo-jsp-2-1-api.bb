SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "db990247a3dbf2d9a50b90f3dc8c2cec8c9c9a1800baccd8c7668c8eef5cc2a53f6c6153e293a61878f233b5604914bd3c570281e1dd94707dab31a0eeb22fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2-1-api \
jsp \
jsp-2-1-api \
jsp-api \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
el-1-0-api \
java-headless \
javapackages-filesystem \
servlet-2-5-api \
update-alternatives"

inherit rpm
