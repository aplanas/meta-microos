SUMMARY = "Noto Gujarati Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-gujarati-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "48b2134249be1b75e4bdaff3bedca05cddb82024b4e6255c8aeeeb302fc06fbeab326f5d589e7f3679761ca2562538892b08bef11cba95ff5ed33ff4768cfec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-gujarati-ui \
noto-sans-gujarati-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
