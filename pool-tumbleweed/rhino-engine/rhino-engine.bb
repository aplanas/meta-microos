SUMMARY = "Rhino Engine"
DESCRIPTION = "Rhino Javascript JSR-223 Script Engine wrapper."
LICENSE = "MPL-2.0"

PV = "1.7.14"

RPM_NAME = "rhino-engine-1.7.14-2.4.noarch.rpm"
RPM_HASH = "d79d49e6eb2402ddae4eb78330a65f8c8de1c870cd753aba64f26b61759e5d5e84febbb85aebce5685cb125e953297b3d292a5de82343d5b9dc95608a2032447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.mozilla:rhino-engine) \
mvn(org.mozilla:rhino-engine:pom:) \
rhino-engine"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.mozilla:rhino) \
rhino"

inherit rpm
