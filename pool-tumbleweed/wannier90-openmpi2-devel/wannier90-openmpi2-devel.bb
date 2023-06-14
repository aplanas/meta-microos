SUMMARY = "Devel files for wannier90-openmpi2"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi2-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "d0864abea63cd7c21a591597ffe86a97851a13258f4b5bad59e156ce01338e2df34660d28c3f1399870fc9b228a261a4cde39efad8791758ebea734dbcd2af06"

RPROVIDES:${PN} += "libwannier.so \
wannier90-openmpi2-devel"

RDEPENDS:${PN} += "libblas.so.3 \
libc.so.6 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20"

inherit rpm
