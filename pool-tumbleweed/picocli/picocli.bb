SUMMARY = "Tiny Command Line Interface"
DESCRIPTION = "Java command line parser with both an annotations API and a programmatic API. \
Usage help with ANSI styles and colors. Autocomplete. Nested subcommands. \
Easily included as source to avoid adding a dependency."
LICENSE = "Apache-2.0"

PV = "4.6.2"

RPM_NAME = "picocli-4.6.2-2.6.noarch.rpm"
RPM_HASH = "97d2ddf294961914f3fbd171f00a95cf9504dda07b5c8c1a4ab13d905cc7a4495b019918e87bf04c23b004bb3bc55f0e1d3d4ff97396d4fb39dd698071a0adb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(info.picocli:picocli) \
mvn(info.picocli:picocli:pom:) \
osgi(picocli) \
picocli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
