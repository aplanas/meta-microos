SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CommonJ Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-commonj-1_1-apis-1.2-36.11.noarch.rpm"
RPM_HASH = "7fb0bd5c220e94c2d56f24c26593f17f0002a273978d571ec61c01b5755a9a238710a0ace7d528cd90e7ef90ac14c431b9b1bdbf1f7837a410cebce674d0f6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commonj-1-1-apis \
commonj-apis \
geronimo-commonj-1-1-apis \
mvn-org.apache.geronimo.specs-geronimo-commonj-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-commonj-1.1-spec-pom-"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
