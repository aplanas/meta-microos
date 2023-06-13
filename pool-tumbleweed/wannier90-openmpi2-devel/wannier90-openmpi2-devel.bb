SUMMARY = "Devel files for wannier90-openmpi2"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi2-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "d0864abea63cd7c21a591597ffe86a97851a13258f4b5bad59e156ce01338e2df34660d28c3f1399870fc9b228a261a4cde39efad8791758ebea734dbcd2af06"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
wannier90-openmpi2-devel \
wannier90-openmpi2-devel(aarch-64)"

RDEPENDS:${PN} += "libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.20()(64bit)"

inherit rpm
