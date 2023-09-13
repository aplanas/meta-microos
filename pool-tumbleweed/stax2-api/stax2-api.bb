SUMMARY = "Experimental API extending basic StAX implementation"
DESCRIPTION = "StAX2 is an experimental API that is intended to extend \
basic StAX specifications in a way that allows implementations \
to experiment with features before they end up in the actual \
StAX specification (if they do). As such, it is intended \
to be freely implementable by all StAX implementations same way \
as StAX, but without going through a formal JCP process."
LICENSE = "BSD-2-Clause"

PV = "4.2.1"

RPM_NAME = "stax2-api-4.2.1-2.1.noarch.rpm"
RPM_HASH = "d29e7d955985df00799b230a1114f9074b422dbe7924444c32ea71d1fd314a24aa47e1ce2c35d9d88d7a519338fa3430c8df1087cb06770631c6387a3db85a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.woodstox-stax2-api \
mvn-org.codehaus.woodstox-stax2-api-pom- \
osgi-stax2-api \
stax2-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
