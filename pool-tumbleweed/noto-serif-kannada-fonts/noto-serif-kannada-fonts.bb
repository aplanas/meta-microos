SUMMARY = "Noto Kannada Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-kannada-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "4a4055e53403d52b7e1592f19244fedef471d8ad59ef984e18a56f4c85c1d9a32100659c6de827cb60ae4a54bd165e3ca55c3f4ca4f3238a49ade68a6054329b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-kannada \
noto-serif-kannada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
