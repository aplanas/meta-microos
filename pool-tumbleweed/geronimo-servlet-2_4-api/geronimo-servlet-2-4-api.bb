SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Servlet v2.4 API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_4-api-1.2-37.1.noarch.rpm"
RPM_HASH = "fd2e5e7911d3fb840a15420fc0055fc98120ba466bbae2ca48477c7b4913a46e05e32932c7d337ad1540a54317960c671aa44ff64ed097fa56fe5d8191feeda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-servlet-2-4-api \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec \
mvn-org.apache.geronimo.specs-geronimo-servlet-2.4-spec-pom- \
servlet \
servlet-2-4-api \
servlet-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
