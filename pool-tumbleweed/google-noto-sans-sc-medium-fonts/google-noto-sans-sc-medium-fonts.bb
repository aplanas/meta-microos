SUMMARY = "Noto Sans Simplified Chinese Font - Medium"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Medium weight of \
Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-medium-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "b544ecce418d60aafe7df2902fddc1facc9b7be5e65f1c9e0d246ead71004c0b50a232896542b44a69de0b3e115029b1bb1dfbc4262fc48b4501a0afaedfab2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-medium-fonts \
noto-sans-sc-medium-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
