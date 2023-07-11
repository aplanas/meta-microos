SUMMARY = "Tiny Command Line Interface"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency."
LICENSE = "Apache-2.0"

PV = "4.7.4"

RPM_NAME = "picocli-4.7.4-2.1.noarch.rpm"
RPM_HASH = "04fe5863f53d27b07bc873fda0397cb93acff32e65942fd403e43ad27f0bcbd511937968a96e8accdecffcef141b624e986f13e8eb77de6245c5f661319d839b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli \
mvn-info.picocli-picocli-pom- \
osgi-picocli \
picocli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
