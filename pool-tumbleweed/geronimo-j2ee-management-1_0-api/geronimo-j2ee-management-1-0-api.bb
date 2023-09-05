SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Management Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "d0f6ea5afc1baa45b74644b4def6f1e5d0423c533a5ca6123662bef82363b7105dac31c4be636ed9d4899df23c6af1c523816a72696376c73260894f8ca6d008"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-management-1-0-api \
j2ee-management \
j2ee-management-1-0-api \
j2ee-management-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-management-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-management-1.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
ejb-2-1-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
