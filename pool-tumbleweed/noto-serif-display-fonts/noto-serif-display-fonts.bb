SUMMARY = "Noto Display Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Display Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-display-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "5fd9af14f8f5d5f89cd83f7fda95f24209d34bb0cbde2b8a036358c682693a897a6754615277472b1c240594158cca47d83e239fc5000a7c8992c7cba290b2e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-display \
noto-serif-display-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
