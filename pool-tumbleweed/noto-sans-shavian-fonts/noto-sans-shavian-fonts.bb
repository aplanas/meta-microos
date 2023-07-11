SUMMARY = "Noto Shavian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Shavian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-shavian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "d4288286920a5146d55227d305bdd26b06bb738e9268bf614c0a020df7871b1dd35726c05284596ea500570d0adff6a534b2ebc49c7f9440483c41a79673b25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-shavian \
noto-sans-shavian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
