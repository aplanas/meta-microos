SUMMARY = "Tiny Command Line Interface"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency."
LICENSE = "Apache-2.0"

PV = "4.7.5"

RPM_NAME = "picocli-4.7.5-1.1.noarch.rpm"
RPM_HASH = "e7520dd5be660c2c3bb4a092049a09475bcdbaec0f08de7c71f110c7122fb787f35658f7675aeb041ebb374bf85b4067a3ba5e74313a9978d4e4bc65a6470c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli \
mvn-info.picocli-picocli-pom- \
osgi-picocli \
picocli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
