SUMMARY = "Noto Osmanya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osmanya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-osmanya-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "cbb36b5f2ea8ca68efac51ec6fa653e0c3edb1c18aa05228ccd364dceadaa94a986ca0bbc0693162db7e88576429d6f492851181a6cb60b640a102c4956e7188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-osmanya \
noto-sans-osmanya-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
