SUMMARY = "Noto Tifinagh Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tifinagh Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinagh-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "0d75850e1fbfa31012dc7f2147d6368fe7dd38a2f3024ff8fc4df0906e7d29b43e20376ce8cd2ac07492b52922cccfa500ea0d4f43e310bc05017e4a76eca76d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinagh \
noto-sans-tifinagh-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
