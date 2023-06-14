SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: J2EE Application Deployment Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-deployment-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "50a72ff993d77f845a77ad51d697c1f6ebd1c05b45747146f3a7240ea3e117f15a27c77decd12c3bc529a96c48e089e6c0c5f92dee61743b99226d04fa96c79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-deployment-1-1-api \
j2ee-deployment \
j2ee-deployment-1-1-api \
j2ee-deployment-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-deployment-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-deployment-1.1-spec-pom-"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
