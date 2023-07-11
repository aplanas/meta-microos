SUMMARY = "Noto Gurmukhi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-gurmukhi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b5f76e225da6b9df19763f173609b6ba0b7864c075e3251486da4884954d68dd69ed8e8027b8e23429040bcd8e504f246f1c430fc0fdb436585cf39c68116018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-gurmukhi \
noto-serif-gurmukhi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
