SUMMARY = "Noto Thai Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thai Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thai-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "edda2995aeb470d7dbc540ac58f25780253d6855a064861b772c49e417f424a157b5389221bbc606f03cd4097b8a3fd36c245d80290d413a7c990164e647bc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thai-ui \
noto-sans-thai-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
