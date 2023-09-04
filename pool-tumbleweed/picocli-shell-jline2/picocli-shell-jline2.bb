SUMMARY = "Picocli Shell JLine2"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Library to build interactive shell applications with JLine 2 and picocli."
LICENSE = "Apache-2.0"

PV = "4.7.5"

RPM_NAME = "picocli-shell-jline2-4.7.5-1.1.noarch.rpm"
RPM_HASH = "04e02d3c428d7ca0b8ae01f8a3b88e02125b338214e47b12225cf463ef6a28a7abd54c6556a466aba538331c8aa6f065b9700d8dc06c5cf56dcc4d3ddd06b88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-shell-jline2 \
mvn-info.picocli-picocli-shell-jline2-pom- \
picocli-shell-jline2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli \
mvn-jline-jline"

inherit rpm
