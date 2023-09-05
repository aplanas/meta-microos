SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CommonJ Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-commonj-1_1-apis-1.2-37.1.noarch.rpm"
RPM_HASH = "e489259342dff57eae235824b0a1ae47bd6653cafaa43428282d70a28ceb94648b6226d52fd285b649a74bfe220a9317dede47b9c84989a94c05492ae85d3a32"
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
