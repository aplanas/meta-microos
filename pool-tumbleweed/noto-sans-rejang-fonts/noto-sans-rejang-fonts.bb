SUMMARY = "Noto Rejang Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Rejang Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-rejang-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "829c7473bc8dd7a3421eefec63ebe81d7e904e4437184e6aade7699fe627b9a54d4aee045acc116af1ca28a2aca333d261d776870d0d6a176cf403bfb923b5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-rejang \
noto-sans-rejang-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
