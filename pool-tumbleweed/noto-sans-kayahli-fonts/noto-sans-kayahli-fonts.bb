SUMMARY = "Noto Kayah Li Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
KayahLi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kayahli-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "bde2d4fb82e4fd13f6b3b0e87f6c4aa88f3bb44782be7585684f3ea32c01c60ba91a208231a7b81a489ce34d6a922d95d4e04424a066009cb45f92355d094719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kayahli \
noto-sans-kayahli-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
