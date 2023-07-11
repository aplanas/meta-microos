SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML Registries (JAXR)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxr-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "203434433032658e5b567afc10880f63f1b650aa27d4c182ae873da74e67150688c2969b5682ae8182778d5b2f441ceb1064cd2aa6cd032720a967272f6e1609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxr-1-0-api \
jaxr \
jaxr-1-0-api \
jaxr-api \
mvn-org.apache.geronimo.specs-geronimo-jaxr-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jaxr-1.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
