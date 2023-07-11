SUMMARY = "Noto Looped Lao Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedLao font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedlao-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "aa50c0df5cbe0cf0911202cdd12f10776801cb15b555784c98cbccd99f1ce3f3c94d6c6d5a69620d44112c6363f4c93b0d932aff2ecc77fb767852fb49159e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedlao \
noto-loopedlao-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
