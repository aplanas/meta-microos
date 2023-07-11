SUMMARY = "Noto Indic Siyaq Numbers Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
IndicSiyaqNumbers Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-indicsiyaqnumbers-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "5c7795941900907dcd5d8c5c2ebfe1b0a89db7e2bef99388c62aaee1b6a03e9fb68322cd12501d053f8456a32de8a045ef25457aac2a8a85085551184933efb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-indicsiyaqnumbers \
noto-sans-indicsiyaqnumbers-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
