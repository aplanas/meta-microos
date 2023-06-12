SUMMARY = "Noto Osage Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Osage Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-osage-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "c9fdfc777b6b2859cc5a2902b102403f477fbeabcca03563d5656b0d82a15ca1ec44703c68e6f1c0734ff65775b00dd5b96cbda5d07b60bf07a039c3431f186b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-osage \
noto-sans-osage-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
