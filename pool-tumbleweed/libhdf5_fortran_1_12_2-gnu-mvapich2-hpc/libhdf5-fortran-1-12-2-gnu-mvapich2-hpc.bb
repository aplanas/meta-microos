SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e70007da6eecb654d9ca986a01efabc620e9c443c7cc30ecf924623e3562f197808839e2f79728f0378df6c7ad3e52bf11ef91d36db22f88ac7a838ef0290849"

RPROVIDES:${PN} += "libhdf5_fortran_1_12_2-gnu-mvapich2-hpc \
libhdf5_fortran_1_12_2-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
