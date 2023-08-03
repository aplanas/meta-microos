SUMMARY = "Devel files for wannier90-openmpi5"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-devel-3.1.0-2.5.aarch64.rpm"
RPM_HASH = "236d69857de35e23a8e60b40bb1ea9cebaad7517d43be18c5ade208c9862e11a931f26cd831054a90b135e8af69e9f507bd690b6aa96bb6c0161006b59c5de85"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi5-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40"

inherit rpm
