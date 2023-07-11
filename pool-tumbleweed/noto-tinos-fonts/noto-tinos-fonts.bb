SUMMARY = "Noto Tinos Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tinos font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-tinos-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "dedee40973b1c9a4616a612deeefd77c71454c18df7935b0b79840e0012374ba3f6caf485d57b1b3ec577600dd77cf5f177213a8f02613a1f492c277aa36cf38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-tinos-fonts \
noto-tinos \
noto-tinos-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
