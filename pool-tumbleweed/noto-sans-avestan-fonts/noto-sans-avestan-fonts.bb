SUMMARY = "Noto Avestan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Avestan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-avestan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "bd40a178cdd35d692d49837aec0b49900697c3ccc2788d0c95a0b7f2466b506a4c8b0474426d9fa3caf22b92d52e5f60b97f03724910f27b774d97cc21b1ad21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-avestan \
noto-sans-avestan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
