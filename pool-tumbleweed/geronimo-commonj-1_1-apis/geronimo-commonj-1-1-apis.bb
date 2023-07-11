SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CommonJ Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-commonj-1_1-apis-1.2-36.12.noarch.rpm"
RPM_HASH = "ac603532076555700989e9f510053c9f307c6a2caa000619353e0b678ee830d95a4567b6fef073fbbfe6e30a319bb228e2f6437877aca715c35d4af27851ea1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commonj-1-1-apis \
commonj-apis \
geronimo-commonj-1-1-apis \
mvn-org.apache.geronimo.specs-geronimo-commonj-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-commonj-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
