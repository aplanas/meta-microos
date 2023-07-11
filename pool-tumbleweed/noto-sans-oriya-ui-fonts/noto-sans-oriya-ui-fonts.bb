SUMMARY = "Noto Oriya Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-oriya-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "818284ae5d80d9e43dfef4f0e0b00af5fb5b5b5a0c801cc9e3fe98d49638b3d622e5b525c7ec9be5ca5bd6bc9e5e1fab808c694bc14e95919487d39436be1d08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-oriya-ui \
noto-sans-oriya-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
