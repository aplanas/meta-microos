SUMMARY = "Noto Hebrew Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Hebrew Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-hebrew-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "c865e37a2158a13f10c4ec00cdc2df78bf2c5b9b7ff1d397a4f54c085b706d9522073b80539d763df6a75af404539a55e4156a06ff92e79c9a5aa7ead8dc1f94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-hebrew \
noto-serif-hebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
