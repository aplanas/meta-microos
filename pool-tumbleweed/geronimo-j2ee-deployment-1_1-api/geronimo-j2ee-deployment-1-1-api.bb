SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Deployment Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-deployment-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "71189b5e9b61baffeeaf2e443ad756371373e5d6d6fcc84c68ca09a237e59bdfa16a4afc1f73964bf42865d568eeff5fa4b6b1936e82c62dd351fe3af9e1e902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-deployment-1-1-api \
j2ee-deployment \
j2ee-deployment-1-1-api \
j2ee-deployment-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-deployment-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-deployment-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
