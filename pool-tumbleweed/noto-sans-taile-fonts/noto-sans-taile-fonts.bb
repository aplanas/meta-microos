SUMMARY = "Noto Tai Le Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiLe Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taile-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ccd014b4002edb990f563e303e9ca966e6780b3fefba47af97d3ba3617beb218850f92f1988196c71d4e7b899811e4dfa349a4f3f48dd226cf86def4e639e2de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taile \
noto-sans-taile-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
