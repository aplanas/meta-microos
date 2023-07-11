SUMMARY = "Noto Deseret Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Deseret Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-deseret-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "fbb3774993c288116c3dbd0e1968c3582a7c506bddbed95f8b98f166bd33968eb90863fecce02da0bfed70648c3d4d64073098992c43172306a578fcca07c205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-deseret \
noto-sans-deseret-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
