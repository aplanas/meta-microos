SUMMARY = "Noto Sans CJK Font - Regular and Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular and Bold \
weights for Noto Sans fonts for the four CJK languages."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-cjk-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "6e2ac647781abd2bcead2e5508fbfc0579134ef46f212cbcaf32f353353519e3c81a23fc2aa6b23328ae8a4d551672d0c2fbdb320d8e11f04a7c979d1039ec69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cjk-fonts \
noto-sans-cjk \
noto-sans-cjk-fonts"

RDEPENDS:${PN} += "google-noto-sans-jp-fonts \
google-noto-sans-kr-fonts \
google-noto-sans-sc-fonts \
google-noto-sans-tc-fonts"

inherit rpm
