SUMMARY = "Noto Old Persian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldPersian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oldpersian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "81121687178bd3812860b9b0ff193df6c351837ca4d630f9b026735ec649ec3da91d3ef62d41e590abd5befcb27cdefd5dca546d0c2a61fbd55569e9ff693927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oldpersian \
noto-sans-oldpersian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
