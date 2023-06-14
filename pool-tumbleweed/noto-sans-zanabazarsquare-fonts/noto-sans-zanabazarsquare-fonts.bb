SUMMARY = "Noto Zanabazar Square Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ZanabazarSquare Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-zanabazarsquare-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6265a30f3b400f9baf83b814055fedb53ae38096fe881b2190b1c98cddc0bbedaa47e546b92740d5c276838621bf0306da549ea33d73c6e9fd19d73e75ef241f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-zanabazarsquare \
noto-sans-zanabazarsquare-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
