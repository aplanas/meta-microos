SUMMARY = "Noto Lao Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Lao Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-lao-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "09f258ee7443a39327a4524b136988e00e4809ae292de87f3b28efb9e8f0e4eae9be2064a318676d658df05eff6e0a148896f81bcd8f12a25cb92410efea544e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-lao-ui \
noto-sans-lao-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
