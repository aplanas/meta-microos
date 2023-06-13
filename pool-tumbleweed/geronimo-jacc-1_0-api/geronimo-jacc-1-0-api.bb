SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Authorization Contract for Containers \
Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "8337857229b126d14a7ea771512c0b3584beca864da6bd7472d951793b95c6a8f87a864119e8e04e2dc4681162281e3cc47d987540b99b2f8b38283a3b0420e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jacc-1_0-api \
jacc \
jacc_1_0_api \
jacc_api \
mvn(org.apache.geronimo.specs:geronimo-j2ee-jacc_1.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-j2ee-jacc_1.0_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
servlet_2_4_api \
update-alternatives"

inherit rpm
