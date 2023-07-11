SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java Transaction API Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_0_1B-api-1.2-36.12.noarch.rpm"
RPM_HASH = "5237115b658763525919bf7a3b9859158209da334a63878cf62c876e786899f296d5a13bf62eb28cc863209d053ac5b6d047983f0a69b1c0d1687af34cb6e68c"
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
