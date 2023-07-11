SUMMARY = "Plexus Interpolation API"
DESCRIPTION = "Plexus interpolator is the outgrowth of multiple iterations of development \
focused on providing a more modular, flexible interpolation framework for \
the expression language style commonly seen in Maven, Plexus, and other \
related projects."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.26"

RPM_NAME = "plexus-interpolation-1.26-2.7.noarch.rpm"
RPM_HASH = "f37d731060dd33444da77066effb721c2090bac506223f4c965098fe53dab97eba0a9d63590b85d702ba8c735443c765288552b3007977e894eb23636694b8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-interpolation-pom- \
plexus-interpolation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
