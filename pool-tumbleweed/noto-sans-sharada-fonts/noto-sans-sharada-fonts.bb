SUMMARY = "Noto Sharada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sharada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sharada-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4a616d6fa602430e7212b4435bdbd06cb166307450a88beaacfeb705b312a9ae7ddc888c58aab3846ceb7fe2e70275043c60d4770b938d42a22103ab1b802aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sharada \
noto-sans-sharada-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
