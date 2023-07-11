SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 1.0 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-1_0-apis-1.2-36.12.noarch.rpm"
RPM_HASH = "bc931d782b39651efa83b6c60b82375f4b8fe0fcb02ffcba93e0964289b54ea824a4c0c18ab07f80b1d8fb1fe6e06d31057fa35094f9456342c8f9b5b7cb6f7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba-1-0-apis \
corba-apis \
geronimo-corba-1-0-apis \
mvn-org.apache.geronimo.specs-geronimo-spec-corba \
mvn-org.apache.geronimo.specs-geronimo-spec-corba-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
