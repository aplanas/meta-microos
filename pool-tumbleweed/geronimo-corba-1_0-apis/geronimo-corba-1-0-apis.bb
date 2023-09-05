SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 1.0 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-1_0-apis-1.2-37.1.noarch.rpm"
RPM_HASH = "a91ff6a8b91bc9412c3efaa39cb80c6f7d56cb6c20f7651729767367278f2ee8fc3f33cf467a80bc3a2e82c5ff71a0ef2e7699adb3408bc066e3b3744e38a215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba-1-0-apis \
corba-apis \
geronimo-corba-1-0-apis \
mvn-geronimo-spec-geronimo-spec-corba \
mvn-geronimo-spec-geronimo-spec-corba-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
