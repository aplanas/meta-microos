SUMMARY = "Noto Canadian Aboriginal Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
CanadianAboriginal Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-canadianaboriginal-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "8ea9541cc9413133d83b5392a0d6b116b9d9a2c27bca81590a773615baa02b166fee6fa0d060e8bf8b7e4f5b6bee25d5c5a12b61926d539b3138fe64d96e1164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-canadianaboriginal \
noto-sans-canadianaboriginal-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
