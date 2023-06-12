SUMMARY = "Devel files for wannier90-openmpi1"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-openmpi1-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "12d007415412b7306684b2d5d8167bb7327d4b9c7db38be15f723e540624ecb37a6eaf0d91cee0f646e49ac6659d29675a35fc21f2f6bc33e9ff4daee07ec4e0"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
wannier90-openmpi1-devel \
wannier90-openmpi1-devel(aarch-64)"
RDEPENDS:${PN} += "libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi_mpifh.so.12()(64bit)"

inherit rpm
