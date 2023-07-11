SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Servlet v2.4 API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-servlet-2_4-api-1.2-36.12.noarch.rpm"
RPM_HASH = "e20fec7ad062a7cd942bdee64e0932800251b9d2f26a040d681dc5c6e3ca758c787384a4a869252a92b9531d4caa197e97564408475f3d055a006dcb95824bf2"
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
