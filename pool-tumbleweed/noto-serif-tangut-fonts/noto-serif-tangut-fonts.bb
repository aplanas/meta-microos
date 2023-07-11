SUMMARY = "Noto Tangut Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangut Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tangut-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d850830b6036b9c63a21e8256b6202017d12c4e2dd7529865341b61f074800d69f0142e73590733f811e75fa33d2cf32a13bea3d87f2e69d1c19dd356e1f5477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tangut \
noto-serif-tangut-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
