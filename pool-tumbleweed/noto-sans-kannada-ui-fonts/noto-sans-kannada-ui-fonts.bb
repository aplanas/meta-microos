SUMMARY = "Noto Kannada Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kannada Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kannada-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "daf6df96da17278e421dac810ac9036593c1d8e4ba5d1a2a0772f5006fe2ae2fcb5f691ec8a816d78e3a0968c589f5ee4550a28432574db534f9624bc79c2751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kannada-ui \
noto-sans-kannada-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
