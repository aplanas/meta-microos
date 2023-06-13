SUMMARY = "Experimental API extending basic StAX implementation"
DESCRIPTION = "StAX2 is an experimental API that is intended to extend \
basic StAX specifications in a way that allows implementations \
to experiment with features before they end up in the actual \
StAX specification (if they do). As such, it is intended \
to be freely implementable by all StAX implementations same way \
as StAX, but without going through a formal JCP process."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "stax2-api-4.0.0-3.10.noarch.rpm"
RPM_HASH = "1789d93be052e6bd2e6135f38e796cedc5a3e3932b66ea4995bb4c6aa630ff15b867c20bf019c486180dbe34e81b3247b13c44503dd144e3765f0bb3c734c7ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.woodstox:stax2-api) \
mvn(org.codehaus.woodstox:stax2-api:pom:) \
osgi(stax2-api) \
stax2-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
