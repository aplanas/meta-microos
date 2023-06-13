SUMMARY = "Development Files for libjte"
DESCRIPTION = "This package includes development files for libjte."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22"

RPM_NAME = "libjte-devel-1.22-1.10.aarch64.rpm"
RPM_HASH = "d3bdfd1b30e80d487a3fcba58671ac1124ef9bbab990d48784af6ba128800a484553ed004175d30a073e777d7d354a6eb3daefad141b7df63846ad995c507b09"

RPROVIDES:${PN} += "libjte-devel \
libjte-devel(aarch-64) \
pkgconfig(libjte-2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjte2"

inherit rpm
