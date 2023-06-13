SUMMARY = "Tiro Telugu Fonts"
DESCRIPTION = "Tiro Telugu has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-telugu-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "39c1ee1cf42252f5f72f757427453d4025e40bd869c7285e6bb032a70f63b6742f011532e647c32a4d70e98ed520a3792ed0a8dc86bf5438d0f6a27bf9044be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-telugu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
