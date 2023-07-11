SUMMARY = "Noto Makasar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Makasar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-makasar-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "cd05169229a0180afeec36a780556e6dc483402f2a56b9a9cc4e840403b41b1093370c7b62139ea26090808c862d9b7a49ee2312461da1c167860e4adc080dec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-makasar \
noto-serif-makasar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
