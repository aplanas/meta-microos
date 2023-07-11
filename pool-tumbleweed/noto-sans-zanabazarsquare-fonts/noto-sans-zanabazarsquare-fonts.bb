SUMMARY = "Noto Zanabazar Square Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ZanabazarSquare Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-zanabazarsquare-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "33b6a5355c905fcecd0366d0fd12dfb58652271dbcb19fcdab76475951b4d5f148766fa3b5664ab73b720ff26da3cb0a7f3c6246b7a139c1e83de20662d3d9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-zanabazarsquare \
noto-sans-zanabazarsquare-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
