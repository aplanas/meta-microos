SUMMARY = "Noto Multani Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Multani Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-multani-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "04c5bd5df85c7d31b69b38d239fde039cf57337286c5480734595309a879ee5a49e4fbb8a912994125235b5eb5503f406b41d63534e8f53b46c64ecce03cf9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-multani \
noto-sans-multani-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
