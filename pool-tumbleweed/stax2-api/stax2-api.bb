SUMMARY = "Experimental API extending basic StAX implementation"
DESCRIPTION = "StAX2 is an experimental API that is intended to extend \
basic StAX specifications in a way that allows implementations \
to experiment with features before they end up in the actual \
StAX specification (if they do). As such, it is intended \
to be freely implementable by all StAX implementations same way \
as StAX, but without going through a formal JCP process."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "stax2-api-4.0.0-3.11.noarch.rpm"
RPM_HASH = "23298b883919d2a64d18850eaac4bc5b35e099904c2354cd58268e365fbfbae59f1f89dd7cad88eaa5b05f0caf18c8985165c4d3c0ae0ac0cdcdeac9528517c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.woodstox-stax2-api \
mvn-org.codehaus.woodstox-stax2-api-pom- \
osgi-stax2-api \
stax2-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
