SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 2.3 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-2_3-apis-1.2-37.1.noarch.rpm"
RPM_HASH = "95dfd0344477aa679e0f9a03f87b32abe80dd7cd84c6eb89f12a8a085acf28ec395a38a196d54c77c528756d27298763d51fe0e1e8e607eb08aeafd1bc16fab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba-2-3-apis \
corba-apis \
geronimo-corba-2-3-apis \
mvn-org.apache.geronimo.specs-geronimo-corba-2.3-spec \
mvn-org.apache.geronimo.specs-geronimo-corba-2.3-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
