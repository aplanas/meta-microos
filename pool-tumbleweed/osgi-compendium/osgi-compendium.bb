SUMMARY = "Interfaces and Classes for use in compiling OSGi bundles"
DESCRIPTION = "OSGi Compendium, Interfaces and Classes for use in compiling bundles."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-7.0.0-3.1.noarch.rpm"
RPM_HASH = "c040ac01d769a511601e733ea1569e66484e4b282505cbf001461d26aea8c7fdf03a5ecf11e984b69dcac58a98aece9a509585fed67ae1f0ecd24ddb7d5706c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.cmpn-pom- \
osgi-compendium \
osgi-osgi.cmpn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
