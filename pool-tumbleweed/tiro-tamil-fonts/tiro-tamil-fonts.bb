SUMMARY = "Tiro Tamil Fonts"
DESCRIPTION = "Tiro Tamil has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-tamil-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "2470ebd25e9fd101f46a9e0ad46c220f3671696da693a2d830d7f11ac89f1440bd1d7df769878788285ee9f40a1ac8e5e18ae3b9d4c24f609c117dc2011cb535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-tamil-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
