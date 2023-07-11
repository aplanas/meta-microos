SUMMARY = "Noto Inscriptional Parthian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
InscriptionalParthian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-inscriptionalparthian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3b2631340f2b9cbf620c2736b9fc56ef413b86e769c62f06c612b26fbab1b6451c8c6759e3eb82e972c2c74d75167b1ae15cf05ab86742fed47ca0cdcafa8b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-inscriptionalparthian \
noto-sans-inscriptionalparthian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
