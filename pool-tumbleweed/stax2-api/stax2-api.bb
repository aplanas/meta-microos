SUMMARY = "Experimental API extending basic StAX implementation"
DESCRIPTION = "StAX2 is an experimental API that is intended to extend \
basic StAX specifications in a way that allows implementations \
to experiment with features before they end up in the actual \
StAX specification (if they do). As such, it is intended \
to be freely implementable by all StAX implementations same way \
as StAX, but without going through a formal JCP process."
LICENSE = "BSD-2-Clause"

PV = "4.2.1"

RPM_NAME = "stax2-api-4.2.1-1.1.noarch.rpm"
RPM_HASH = "896e2cf24a809e2d7e952ae0b36ed473505444172a6c61af36f7289ebebaf6e47a0cf507c71f5d7a0d1b8d0dc4698b824e7051d90d6e0ce30f48b044999aaba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.woodstox-stax2-api \
mvn-org.codehaus.woodstox-stax2-api-pom- \
osgi-stax2-api \
stax2-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
