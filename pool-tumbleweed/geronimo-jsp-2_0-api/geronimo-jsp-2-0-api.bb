SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaServer Pages Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "e68f8298ad3192223098313cd8e25605e63635549a04d4c14391c33c4d22407b7deaa137e8a469ecefa4f040ec96c9b7f712281a3f67e1c98991dc24a56b3851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2-0-api \
jsp \
jsp-2-0-api \
jsp-api \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
servlet-2-4-api \
update-alternatives"

inherit rpm
