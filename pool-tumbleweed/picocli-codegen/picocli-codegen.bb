SUMMARY = "Picocli Code Generation"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Tools to generate documentation, configuration, source code and other files \
from a picocli model."
LICENSE = "Apache-2.0"

PV = "4.7.4"

RPM_NAME = "picocli-codegen-4.7.4-2.1.noarch.rpm"
RPM_HASH = "516101323971bd4a208cedf4faa57238e363e6bfdbf93d4acd5761f8bdb35c4a85bda158c0f2318d5a62571182d09a2603a608b6caee0d71c3d8dac57d25f8a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-codegen \
mvn-info.picocli-picocli-codegen-pom- \
picocli-codegen"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli"

inherit rpm
