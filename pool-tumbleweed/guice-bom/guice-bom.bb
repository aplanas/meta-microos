SUMMARY = "Bill of Materials for Guice"
DESCRIPTION = "Guice is a dependency injection framework for Java 5 \
and above. This package provides Bill of Materials module for Guice."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "guice-bom-5.1.0-1.1.noarch.rpm"
RPM_HASH = "f7ff9129a86535343b04d9eb4ebe80279574735d083310f768c4dbfbb501ca427eecf0ad664dda8fa37f09ca4baffd9c2fe258e7e504d2885ba5d3bc7b7f4b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guice-bom \
mvn-com.google.inject-guice-bom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
