SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Authorization Contract for Containers \
Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "e8bc347f53f6c21676e5edf8775bcdf34b1197efa97ca7e80ed2021cde73206d08ae723024078cbcc67a9e0de908ce9e543d5482eb9d6e977e118368255fb67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jacc-1-0-api \
jacc \
jacc-1-0-api \
jacc-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-jacc-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-jacc-1.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
servlet-2-4-api \
update-alternatives"

inherit rpm
