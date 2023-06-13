SUMMARY = "Noto Tifinagh Adrar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAdrar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghadrar-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "78338c4dd5d9df4dcc9e789aa0c8ce25fcfa4a8fdf66a8cd321e016e588daf0f6d1e9a43a779f74e5a1f2cb3109bf34f8328e997cdd07117732b5eb4b6aa1625"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghadrar \
noto-sans-tifinaghadrar-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
