SUMMARY = "Noto Gurmukhi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gurmukhi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "2691832e78f6a1bc35f349d929ecf37703fc7a101458390f6e33aa45e3f7484eabda6cecc37f3e2a957bba0d8e264e699df24b7970de96074af4be761bb2311e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gurmukhi \
noto-sans-gurmukhi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
