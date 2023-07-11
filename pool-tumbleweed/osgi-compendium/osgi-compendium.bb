SUMMARY = "Interfaces and Classes for use in compiling OSGi bundles"
DESCRIPTION = "OSGi Compendium, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-7.0.0-2.5.noarch.rpm"
RPM_HASH = "94f2ad353bd2a20e604978470b755ab478f706fec60189343fbd77b424a4c69c5242be79e4bfc0f58fd4576856c8fa78b27a9f52a69ff5c65f4ffd47697709f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.cmpn-pom- \
osgi-compendium \
osgi-osgi.cmpn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
