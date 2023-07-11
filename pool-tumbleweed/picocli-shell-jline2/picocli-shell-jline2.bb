SUMMARY = "Picocli Shell JLine2"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency. \
 \
Library to build interactive shell applications with JLine 2 and picocli."
LICENSE = "Apache-2.0"

PV = "4.7.4"

RPM_NAME = "picocli-shell-jline2-4.7.4-2.1.noarch.rpm"
RPM_HASH = "de034b94496c3a2e6e1d89aaefa5a4dbed5716a0c202e2bde48fa81d1609d7d8f4e0a47777471ce922387e387250320afe5a311ad17b9f666b8272a72aa69a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-info.picocli-picocli-shell-jline2 \
mvn-info.picocli-picocli-shell-jline2-pom- \
picocli-shell-jline2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli \
mvn-jline-jline"

inherit rpm
