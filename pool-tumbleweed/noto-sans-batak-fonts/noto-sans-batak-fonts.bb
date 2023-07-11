SUMMARY = "Noto Batak Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Batak Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-batak-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "500f032e9f897f6d0dc7072117486fb4255fe9d6b75817c10938f6e5681ebbd985e2d1cea573979b41c29e172c434f16128a9d6482f553f8167d6673783a1683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-batak \
noto-sans-batak-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
