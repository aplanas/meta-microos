SUMMARY = "Noto Old North Arabian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldNorthArabian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldnortharabian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "31c28583fb5e8e893ca0e311cf5a7cc1af1b06b171a8051b425356162a7e5f078a43d6c53cbe833d23b54a46b41b1fc96c77242b0dc127a3b23094fe5325a4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldnortharabian \
noto-sans-oldnortharabian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
