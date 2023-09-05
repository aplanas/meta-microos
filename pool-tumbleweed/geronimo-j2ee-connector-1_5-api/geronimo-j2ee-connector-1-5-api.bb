SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Connector Architecture Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-connector-1_5-api-1.2-37.1.noarch.rpm"
RPM_HASH = "2a80dfd585572d1083c75ae9b3733e2a50672d418353219a0d9fdd461d5d73a92279784d0d618072291367a31e210b045175df2453e67fae98249e5df755ceeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-connector-1-5-api \
j2ee-connector \
j2ee-connector-1-5-api \
j2ee-connector-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-connector-1.5-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
jta-1-0-1B-api \
update-alternatives"

inherit rpm
