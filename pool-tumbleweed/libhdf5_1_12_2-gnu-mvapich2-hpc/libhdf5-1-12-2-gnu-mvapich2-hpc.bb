SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5451709a5800732c4a9d90ac55a1bbdb223e456a20f4ce90d32d4bdc2da9093f73687561f1d0fcf4c8d5c170fb37c83efbf45e7a44f3642cc54e276836489452"

RPROVIDES:${PN} += "libhdf5_1_12_2-gnu-mvapich2-hpc \
libhdf5_1_12_2-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libz.so.1()(64bit)"

inherit rpm
