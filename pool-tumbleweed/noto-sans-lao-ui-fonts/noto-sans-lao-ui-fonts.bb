SUMMARY = "Noto Lao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lao-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c90ccea19375da686018b24839d9d00a9077261084d9834f5769faaa75bab23c4ab9a501605950797a703319895018e26b283003710acbaef5bfce41e1c4e217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lao-ui \
noto-sans-lao-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
