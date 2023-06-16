SUMMARY = "Noto Ogham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ogham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ogham-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6327555aa2363ea6827d2505944df6c3fa2f20c257c17f6a0a3fe6e39e2715b37ba9841562328181d8fcf06893ed992413912e39b10944a89dd519595130fcfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ogham \
noto-sans-ogham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
