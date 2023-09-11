SUMMARY = "OSGi Core API"
DESCRIPTION = "OSGi Core Release 8, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-8.0.0-2.1.noarch.rpm"
RPM_HASH = "3b1227aecca07a5f8f4fe5d8d9b6b9e86e31facb31d247e9cb1f7a8231dbb988381658683aa386bb82bcf3d01abacd7ba86711e8d277b95f42bcd72e7468d305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.core \
mvn-org.osgi-osgi.core-pom- \
osgi-core \
osgi-osgi.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
