SUMMARY = "Noto Balinese Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Balinese Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-balinese-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "3581ce814df86c7940b660f604c6b0e25b085bd2ff4da0f5d200b8b6463e335678e0f06f0672557519777e8097529c3f8e7bb6f7ca4c9e49951bee458212ce3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-balinese \
noto-serif-balinese-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
