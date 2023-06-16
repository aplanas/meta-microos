SUMMARY = "Noto Gujarati Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-gujarati-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "686687e0363ac98dc27ed3c9db382b17d755656809f6d1fe09a5b9195aa83552247765304ce5f4c5a677b45baa712f18929953a618dd6d3064512d068312abf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-gujarati \
noto-serif-gujarati-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
