SUMMARY = "Noto Oriya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oriya-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "9d0935d772a7a247610817a9273d6a6b66c6cb024e5d4e8cbd478df8204947752f44abdd7253e1b47ccd208e36babca428d29142a4d60a1621e2a7cab07407cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oriya \
noto-sans-oriya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
