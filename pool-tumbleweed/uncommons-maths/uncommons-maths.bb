SUMMARY = "Random number generators library for Java"
DESCRIPTION = "The Uncommons Maths library provides five easy-to-use, \
statistically sound, high-performance pseudo-random \
number generators (RNGs)."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-1.2.3-2.1.noarch.rpm"
RPM_HASH = "7c458a2fbf9ce0e49a778446a9a340d7cbf0d23410d89097b2f384446db4ae280a62e895b253323845a06031a896bafd883c336313eba40a3834c2a12e572506"
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
