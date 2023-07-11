SUMMARY = "Noto Bengali Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bengali Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-bengali-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "208da8ec850ba4d7804c0dec453209d04e9773e56a2de74a3eb96c60375f167859a0ba9cfecdc04a84ae85acc76582f3775b3a0e9946ca3d08d8f2cb7345c518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-bengali \
noto-serif-bengali-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
