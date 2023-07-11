SUMMARY = "Library for the 2D bin packaging problem"
DESCRIPTION = "A library and framework for the 2D bin packaging problem."
LICENSE = "LGPL-3.0-only"

PV = "0.4+git.20201105"

RPM_NAME = "libnest2d-devel-0.4+git.20201105-1.9.aarch64.rpm"
RPM_HASH = "f332582a93a5ceb00734a64cdb1853173595a6a44955c32a0a09e0896e1f3bcdd27201dc008023cab4e339f7374cc897da5e092e19d460fbc12f43af68825163"

RPROVIDES:${PN} += "cmake-Libnest2D \
libnest2d-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libpolyclipping-devel \
pkgconfig-nlopt"

inherit rpm
