SUMMARY = "Noto Devanagari Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Devanagari Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-devanagari-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d0ad8b0ad2660ecc6201ef8e941d9e6ece79428f39578d8fd6111b36f53392d452364065139c0c0fffefc254a1404d2d4f182725e1ba726c07cc38e1b961d4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-devanagari \
noto-serif-devanagari-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
