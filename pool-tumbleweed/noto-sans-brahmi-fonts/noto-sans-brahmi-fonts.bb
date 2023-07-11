SUMMARY = "Noto Brahmi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Brahmi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-brahmi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "18dba6abff69b6edc2f8f05449b1ade2fb746c32994fdfc5de82bba3eed9567b469169ba6b1d40571fe7c43334f963639d814c250e7dd5c7baa0b2c0b1b7864d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-brahmi \
noto-sans-brahmi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
