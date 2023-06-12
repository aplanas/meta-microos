SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "370b059b9a8069b3e49195d1913ccbecaac24b15fc016feb15fd4f4eea8ad20061f4aa4be668860ae421e01e2fb5102881ba842aa4107686b5ddcae4956a3306"

RPROVIDES:${PN} += "libhdf5_hl_1_12_2-gnu-openmpi3-hpc \
libhdf5_hl_1_12_2-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
