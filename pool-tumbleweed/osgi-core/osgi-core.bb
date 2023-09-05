SUMMARY = "OSGi Core API"
DESCRIPTION = "OSGi Core Release 8, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-8.0.0-1.1.noarch.rpm"
RPM_HASH = "5481321f6c5a9255b94f7252dc06867807f2808bf7923789731177625ec4782e1ae6395a0c4851b2fdbea9baf14081f6f10bf0d3e70d1509a12861720a212749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.core \
mvn-org.osgi-osgi.core-pom- \
osgi-core \
osgi-osgi.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
