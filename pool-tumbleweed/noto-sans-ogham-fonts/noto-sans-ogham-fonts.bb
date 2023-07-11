SUMMARY = "Noto Ogham Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Ogham Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-ogham-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "172fa92b5984689e48be1a9554fba93b3775602508775eb3fb321aaf8f6b2bafe63c9d61ad04efdcb24d6275fba26defd619149eb216556b1146015942347990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-ogham \
noto-sans-ogham-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
