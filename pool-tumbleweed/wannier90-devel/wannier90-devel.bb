SUMMARY = "Devel files for wannier90"
DESCRIPTION = "This package provides files needed for developing against wannier90."
LICENSE = "GPL-2.0-only"

PV = "3.1.0"

RPM_NAME = "wannier90-devel-3.1.0-2.3.aarch64.rpm"
RPM_HASH = "248057be91fad3ba3adae4e599c91a52b395115c528a53ea4cc69c3ae1d2c57f3d57562673b81121482ffd075610f80310ec759ff6f6d692e160698fec7e7385"

RPROVIDES:${PN} += "libwannier.so()(64bit) \
pkgconfig(wannier) \
wannier90-devel \
wannier90-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
