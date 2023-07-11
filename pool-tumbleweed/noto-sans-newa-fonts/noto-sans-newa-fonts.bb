SUMMARY = "Noto Newa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Newa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-newa-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "231ec276e0bddc1c3cb1be4c0257ad889b8e2f9182d995343a7e1d57e83581ca5a6ee5966e960d911099283c5e8fe2440a1779c2c8cd95e641f126996eaddfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-newa \
noto-sans-newa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
