SUMMARY = "Noto Pahawh Hmong Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PahawhHmong Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-pahawhhmong-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e216d000e0a05abc0b412891e800b57386288b1010f36adcd6b33715e7ec1e3afb138d10c2f3fff6abb2125aba80903e1ad89f31f267510c0cd425ef712e2d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-pahawhhmong \
noto-sans-pahawhhmong-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
