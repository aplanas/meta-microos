SUMMARY = "Noto Balinese Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-balinese-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9774306e91949c258d702c0a0eef31ae843e4fe06cf554054efba87e7d0dc164cd9df547e45f21cdb9798aef15078ffc591e4c8743731e4b41a42d428e2061cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-balinese \
noto-sans-balinese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
