SUMMARY = "Rhino Engine"
DESCRIPTION = "Rhino Javascript JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-engine-1.7.14-2.5.noarch.rpm"
RPM_HASH = "02e1b62f1cd435f86e45b11f45258293d3ea40f6ff48a0e583e1914e7df31abfaac79e5689f825fa208d26dd9bd9d117cd38615d0317edebf0c356c90e217774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino-engine \
mvn-org.mozilla-rhino-engine-pom- \
rhino-engine"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.mozilla-rhino \
rhino"

inherit rpm
