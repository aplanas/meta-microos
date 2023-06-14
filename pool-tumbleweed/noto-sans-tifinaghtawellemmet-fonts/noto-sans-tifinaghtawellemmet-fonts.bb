SUMMARY = "Noto Tifinagh Tawellemmet Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghTawellemmet Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghtawellemmet-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2011d4301137239355b2b54c975a07ca41b5a58522733bedd6d3cb7d4dc254a703abd930e6cb9560d00f9298fae40168a24463754926e1019d74033c354f2d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghtawellemmet \
noto-sans-tifinaghtawellemmet-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
