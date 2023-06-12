SUMMARY = "Noto Vithkuqi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-vithkuqi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "65a1d86a76f892b4583d40219093e7f6ef461a01baabdd29e220c77ef38ee1724b828c6577a941bbeb4882d016b90be959ba7efd02f803d3ce620275d3ef64d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-vithkuqi \
noto-serif-vithkuqi-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
