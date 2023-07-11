SUMMARY = "Bill of Materials for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Bill of Materials module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-bom-5.1.0-1.2.noarch.rpm"
RPM_HASH = "4b6a2fc428e13a07c10bfc8be440bc8eb36e3f52a4911f274fd6fbb4fed2b82d97f1379055af36d7de29ba3bbd3ff330966efdf8b331ed9b21bdf8a2b650c78c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-bom \
mvn-com.google.inject-guice-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
