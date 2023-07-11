SUMMARY = "Development Files for libjte"
DESCRIPTION = "This package includes development files for libjte."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte-devel-1.22-1.11.aarch64.rpm"
RPM_HASH = "958ac865c39765fb0ba4e7a4affb43a250f2ea88088412d7490f97d8de9665e0b5a7f819059ce6da5bde4f91f68acf28a32dfbb98c0d39c5b0c6f06d2d1f43aa"

RPROVIDES:${PN} += "libjte-devel \
pkgconfig-libjte-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjte2"

inherit rpm
