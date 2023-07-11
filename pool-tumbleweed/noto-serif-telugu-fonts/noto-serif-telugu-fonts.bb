SUMMARY = "Noto Telugu Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-telugu-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ef2a032c8cea96ecd4b5631351f881a8b6df561716160e0964f680147ad397756e85071927773cd3756c4760c9ea43418dc5ae2aea57f7851d230dbb948a22d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-telugu \
noto-serif-telugu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
