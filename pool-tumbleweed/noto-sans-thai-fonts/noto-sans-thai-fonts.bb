SUMMARY = "Noto Thai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thai-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "af05815e50e3fcbdd87760d06a3a98e3e8b54caff39076c55c5928183bde8a8dd37285e9ad2224434648e309705bd97a7149d86c33e538e35bc3f12931ee6c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thai \
noto-sans-thai-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
