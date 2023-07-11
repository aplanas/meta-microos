SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Enterprise JavaBeans Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-2_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "43f67cbd9742d1fcc1045f2462345e4b02b0adc785183358acc643bae9a0855c978a06aa42f01decb336fd6a372af7e30fc287773047fb4df79f4679036364f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ejb \
ejb-2-1-api \
ejb-api \
geronimo-ejb-2-1-api \
mvn-org.apache.geronimo.specs-geronimo-ejb-2.1-spec \
mvn-org.apache.geronimo.specs-geronimo-ejb-2.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
jta-1-0-1B-api \
update-alternatives"

inherit rpm
