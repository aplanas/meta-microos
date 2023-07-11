SUMMARY = "OSGi Core API"
DESCRIPTION = "OSGi Core Release 7, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-core-7.0.0-3.5.noarch.rpm"
RPM_HASH = "85d7e715707c1629ccbbac43ceb9e82f2760783cb852239dd701048f1e9f34ecb8ea07af576cbffa5bb367b07e1d89dda9a2a1e63b3d91fa9f65543f98dd5c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.core \
mvn-org.osgi-osgi.core-pom- \
osgi-core \
osgi-osgi.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
