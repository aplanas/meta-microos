SUMMARY = "Noto Looped Lao Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedLao font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedlao-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ead29eaa579d66de5ec70276c2114d3ea8a91fcf4d50266dca12bfbb4c21ac69950e10b69e878fd916be6d453059a6f7abfe804eaef676c653c5aa08d608dda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedlao-ui \
noto-loopedlao-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
