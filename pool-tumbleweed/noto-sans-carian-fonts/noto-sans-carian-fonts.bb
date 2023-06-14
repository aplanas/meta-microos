SUMMARY = "Noto Carian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Carian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-carian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "e89867414c8f0dad8bc8131759581a5d2ef10f95c1d0a9afce99e98b43499e417b59aa89c72a49b34e584337c9221ea25d12a1f21067e1c624a07e6a6c25e629"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-carian \
noto-sans-carian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
