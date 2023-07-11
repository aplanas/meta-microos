SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 2.3 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-2_3-apis-1.2-36.12.noarch.rpm"
RPM_HASH = "583392536716266d1d3654165e6690f06ad7baedbaffd73f57aecbf479d04bb6e02896677f51dc5aeaf1c70add74aec87a34984a4959f8cc9d5d566763e19caf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba-2-3-apis \
corba-apis \
geronimo-corba-2-3-apis \
mvn-org.apache.geronimo.specs-geronimo-corba-2.3-spec \
mvn-org.apache.geronimo.specs-geronimo-corba-2.3-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
mvn-logkit-logkit"

inherit rpm
