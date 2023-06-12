SUMMARY = "Noto Old Uyghur Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldUyghur Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-olduyghur-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "23e114c8472eb1d49c24769bd39a680be8ab6761d1413a085d6928d53ed460e637cfc9545418c7565f72d8f4ecfb4324b181b2a481cc0486f61b40fa7b5e1ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-olduyghur \
noto-serif-olduyghur-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
