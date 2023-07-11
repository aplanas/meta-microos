SUMMARY = "Noto Osmanya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osmanya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-osmanya-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3c3503e3689681871e1947cb5dfc6f973dca89854973298d9ff1815458d1992c5350fac87633bc1340cd9061849b64f3490c31a4f04969f77b2c3668382046ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-osmanya \
noto-sans-osmanya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
