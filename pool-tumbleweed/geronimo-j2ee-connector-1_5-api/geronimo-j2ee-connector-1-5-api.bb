SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Connector Architecture Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-connector-1_5-api-1.2-36.12.noarch.rpm"
RPM_HASH = "1b46f66ac0952f644d1f4ec056fe44a0df1977d635bb94fa26157bf99d2aca25e46e4c18ca50c8e5c328c2bab6f1ce4db6bc759971f3a24303298da838e6ea4d"
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
