SUMMARY = "Noto Tibetan Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tibetan Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tibetan-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c35ae428480e1e2055053915da45035235daff2f27d1e92a5c0474034fc391c2f5e7960cf204b558d2da435d025479ca2a68f8bd6113cdd78e5e3d109f65ce71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tibetan \
noto-sans-tibetan-fonts \
noto-serif-tibetan \
noto-serif-tibetan-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
