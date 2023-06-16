SUMMARY = "Noto Myanmar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-myanmar-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "647bdc7f5207ce91826a37e5ee6aa11fe60af705dce185ffbef61d8c9c39cc33a5903041809b633f2d3b795236677bf8acd8ef8dcaea8d646d8f9a2b6d99d6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-myanmar \
noto-serif-myanmar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
