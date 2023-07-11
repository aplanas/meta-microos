SUMMARY = "Noto Telugu Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Telugu Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-telugu-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b53acee3b25fb67c75c4b0e67cf622d25bc108844c7a72f03dd9693590ce58bff7c34d64ce651f345826a44c97118ebf42b2f71e93fddcf544f391da220f853d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-telugu-ui \
noto-sans-telugu-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
