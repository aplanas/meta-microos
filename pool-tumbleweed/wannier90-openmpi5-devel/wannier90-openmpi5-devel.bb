SUMMARY = "Devel files for wannier90-openmpi5"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi5-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "f2c8a75929d1b0c2d8adf7f28e736b2c4990fc4d24d561c661c7f83d47fbfc426e36043951dd1c647d0c29d1cbc5f7c87fdb716a1f6c21d358ac3ccb4644063b"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
wannier90-openmpi5-devel \
wannier90-openmpi5-devel(aarch-64)"
RDEPENDS:${PN} += "libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.80()(64bit)"

inherit rpm
