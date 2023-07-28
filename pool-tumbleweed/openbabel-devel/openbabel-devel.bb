SUMMARY = "Development files for Open Babel"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-devel-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "f171a9e3df7469963b3260a5ed928d57df2c766df08e05161f0519eb77250da74d62ff9efdc67a0839577a0ea03d89fdf57a7a6a4f67aa84920b2dabd4487605"

RPROVIDES:${PN} += "cmake-OpenBabel3 \
libopenbabel-devel \
openbabel-devel \
pkgconfig-openbabel-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenbabel7 \
pkgconfig-zlib"

inherit rpm
