SUMMARY = "Plexus Interpolation API"
DESCRIPTION = "Plexus interpolator is the outgrowth of multiple iterations of development \
focused on providing a more modular, flexible interpolation framework for \
the expression language style commonly seen in Maven, Plexus, and other \
related projects."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "1.26"

RPM_NAME = "plexus-interpolation-1.26-2.6.noarch.rpm"
RPM_HASH = "3bc420488f87907a5adac9ca9b100f43c4de9742d8a93965db58d702c6dc26bbaf9bb669b6e8143cee638055e38ea62c29b5d47ec476d75c44576d964f4e83c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-interpolation-pom- \
plexus-interpolation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
