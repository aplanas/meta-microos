SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Transaction API Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_0_1B-api-1.2-37.1.noarch.rpm"
RPM_HASH = "62999ef98136464b6423d2f42728e57abaa3caff91e728ec1104acde82f8a53e2feff258da26a85839793c09b76e66d7f256237730f83f46d70df19b81c762db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1-0-1B-api \
jta \
jta-1-0-1B-api \
jta-api \
mvn-org.apache.geronimo.specs-geronimo-jta-1.0.1B-spec \
mvn-org.apache.geronimo.specs-geronimo-jta-1.0.1B-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
