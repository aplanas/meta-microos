SUMMARY = "Random number generators library for Java"
DESCRIPTION = "The Uncommons Maths library provides five easy-to-use, \
statistically sound, high-performance pseudo-random \
number generators (RNGs)."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-1.2.3-1.19.noarch.rpm"
RPM_HASH = "e1d4c7c05423f0cb449c5b826cbf0eddb2fb16cfc361f61102dfd43b83e927368eb98f0331b9c7fb203c62e44abc6060f115609931de4b236d9adef7e8fdd703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.uncommons.maths-uncommons-maths \
mvn-org.uncommons.maths-uncommons-maths-pom- \
osgi-org.uncommons.maths \
uncommons-maths"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jfree-jcommon \
mvn-org.jfree-jfreechart"

inherit rpm
