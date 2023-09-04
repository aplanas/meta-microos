SUMMARY = "Picocli Code Generation"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Tools to generate documentation, configuration, source code and other files \
from a picocli model."
LICENSE = "Apache-2.0"

PV = "4.7.5"

RPM_NAME = "picocli-codegen-4.7.5-1.1.noarch.rpm"
RPM_HASH = "5e3e09249fd9bcc63d5384c10284c468e2842b89772d0ea36d1de427084fb12c6feb6a52a3cc23f5cf18d5eac08ffb3c0021e0995b02224bc66def8b9f34df5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-codegen \
mvn-info.picocli-picocli-codegen-pom- \
picocli-codegen"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli"

inherit rpm
