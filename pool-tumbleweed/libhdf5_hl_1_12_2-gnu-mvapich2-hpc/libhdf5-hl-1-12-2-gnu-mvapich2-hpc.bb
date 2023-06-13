SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "7ff3f531dcc195e7d83e85a3b1b4e25f368c5b672a9f70eddb4a7db05fc0a7dd7983fccf10213bac62f6930f2fb08b58eba1ad4d763298dd1564be813fbe0c4f"

RPROVIDES:${PN} += "libhdf5_hl_1_12_2-gnu-mvapich2-hpc \
libhdf5_hl_1_12_2-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5_1_12_2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
