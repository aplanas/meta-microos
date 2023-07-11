SUMMARY = "Noto Tangsa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangsa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tangsa-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "097d19b886634e3eb36ea3d74f74af94cd41eef1b06a7c4a2c7622cd6980955735b2dc7372b4e21b219dd5144f8f6cfde69fc35c8d0479b33be58b7d7335df1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tangsa \
noto-sans-tangsa-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
