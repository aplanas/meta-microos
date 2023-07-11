SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Management Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "b161810fdb6716a0167783b4d4a7ab60c47a59540de1f092eb029c5d6484e77f461785e7b4bc069bacf96d8dde39aa60ff6bf37e0cdfe6b080f4a8981192365b"
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
