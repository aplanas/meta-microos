SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Authorization Contract for Containers \
Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "e69f4e4c876b0d95db9c3ab70c1296beac72e775cfcfbe9d1ca85ec353a0f49fcf23aa98c68b342ba18b9c6aaea4a92416e4c02fcff8608c7bb498f4196c9e82"
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
