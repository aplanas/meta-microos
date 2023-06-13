SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bc903519b4a6d13924244fef07b90d44d80c0b425c01441b9e2b5c454596860c9d35909464db33c20ac4caf7619e35969cad44e45ea9ded931e4ce1005b7e7e7"

RPROVIDES:${PN} += "libhdf5_fortran_1_12_2-gnu-hpc \
libhdf5_fortran_1_12_2-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
