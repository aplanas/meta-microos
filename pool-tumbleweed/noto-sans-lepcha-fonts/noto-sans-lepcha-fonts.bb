SUMMARY = "Noto Lepcha Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lepcha Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lepcha-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c3f59c0651c036a4b3391a194117187eb5a0f7653ee7343d7c2225616cb1ff6e3fb1666a38b0ae45018f162d157e8729b577d61c2fee751cded0a5e6bdf42c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lepcha \
noto-sans-lepcha-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
