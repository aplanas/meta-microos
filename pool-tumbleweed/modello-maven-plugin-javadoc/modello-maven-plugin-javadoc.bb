SUMMARY = "Javadoc for modello-maven-plugin"
DESCRIPTION = "API documentation for modello-maven-plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "2.1.2"

RPM_NAME = "modello-maven-plugin-javadoc-2.1.2-1.1.noarch.rpm"
RPM_HASH = "b40419bf92b9c6ce322cca9d39a3b5245bb27b0c97b254a838fe876db6da5d2e8ee190e906ffce80f85cce4f2adf8c52495ca9e439267f30fdb6c6557b866cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
