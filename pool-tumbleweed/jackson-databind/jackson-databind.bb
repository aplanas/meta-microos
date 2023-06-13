SUMMARY = "General data-binding package for Jackson (2.x)"
DESCRIPTION = "The general-purpose data-binding functionality and tree-model for Jackson Data \
Processor. It builds on core streaming parser/generator package, and uses \
Jackson Annotations for configuration."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "2.13.4.2"

RPM_NAME = "jackson-databind-2.13.4.2-1.2.noarch.rpm"
RPM_HASH = "cb0554cd9b1bfac399ff92a3d9c88b0224d3f218c532a4c9fefea87e3f4f5721f0d5039761c99a0a73d5db8b6e759ad3b3d4910e4035b3ff8b3cca8f007be6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-databind \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(com.fasterxml.jackson.core:jackson-databind:pom:) \
osgi(com.fasterxml.jackson.core.jackson-databind)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-annotations) \
mvn(com.fasterxml.jackson.core:jackson-core)"

inherit rpm
