SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Deployment Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-deployment-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "dab49acd7e6bfd3c631f25d30c24f9206b05e27ada5c1ab9544c69ae027d25f17f5da979fe3b1bb6257f44b6e5d6214e6df832804c469e101e306e296c01d1f3"
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
