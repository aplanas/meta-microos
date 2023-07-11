SUMMARY = "Noto Cousine Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cousine font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-cousine-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "547ca334800f8f661ef50927e4f2b8cf0110432df2474b2ed10ac4fd8f8cd0b29f0f4cd3104d1b1b5f6f22971a13cc85644d07cd0e9ed3219dda92d4e1aba08a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cousine-fonts \
noto-cousine \
noto-cousine-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
