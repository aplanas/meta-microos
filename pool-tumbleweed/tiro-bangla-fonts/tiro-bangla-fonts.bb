SUMMARY = "Tiro Bangla Fonts"
DESCRIPTION = "Tiro Bangla has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-bangla-fonts-1.52-1.2.noarch.rpm"
RPM_HASH = "e0b58bafe5c7e65d8d26fa7a98060315a70ab6e5fb0c3e4d7cd58f4ed79facd3037e8f7f07f0b0dc373b05cac821515d5330c33ae0094513e33077342194684b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-bangla-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
