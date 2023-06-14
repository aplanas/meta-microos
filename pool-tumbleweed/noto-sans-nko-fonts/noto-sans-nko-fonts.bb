SUMMARY = "Noto NKo Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
NKo Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-nko-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "7f21514074e75f9447405a8374328997676e651da37cb9b7e51426322507d5ee8b384f755b08ba3a8a473948f53069bfc7c593460e02ee2850f25ad978b168c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-nko \
noto-sans-nko-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
