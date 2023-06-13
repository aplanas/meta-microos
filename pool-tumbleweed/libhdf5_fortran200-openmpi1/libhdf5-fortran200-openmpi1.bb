SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi1 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bc2b358ca4a7f2beeb64cae8b2bf84d08b71ffe3e2de6f651ffc75ef76eea68578211b8bd2b4f075d27d39a9d83ca5d8696b77701550ff3b9f8ba7135e2d52c2"

RPROVIDES:${PN} += "libhdf5_fortran-openmpi1 \
libhdf5_fortran.so.200()(64bit) \
libhdf5_fortran200-openmpi1 \
libhdf5_fortran200-openmpi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libhdf5.so.200()(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
