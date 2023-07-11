SUMMARY = "Noto Carian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Carian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-carian-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a2788e39edbe1a9302af01d8b15c0fad0d560ce8254f41db09acb115755349f9c86f1be9f62ffd7bcf5201353d09779fa13d3d69ee29fd138e6eb053d05842f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-carian \
noto-sans-carian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
