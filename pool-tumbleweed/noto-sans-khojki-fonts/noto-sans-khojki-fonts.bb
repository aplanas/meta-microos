SUMMARY = "Noto Khojki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khojki-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "7179f7edc97326b2702a8ddb48875e5bad7267ba24ee6df3cbe2d5bbd14923a3344373e624ce2d6e5da4f2ba3437c422e2c1432bb074d3cf6fcf954058953583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khojki \
noto-sans-khojki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
