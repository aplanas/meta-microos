SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "6754f91342f8cc8c960ad8446da9711cabf9680ef14c04723991e61c2fd2b74137e601842241d2c721532bcfa2319bb50ebc2cb5bc7dfc0abcf488d4b9bc3d7b"

RPROVIDES:${PN} += "libhdf5_hl_cpp-mvapich2 \
libhdf5_hl_cpp.so.200()(64bit) \
libhdf5_hl_cpp200-mvapich2 \
libhdf5_hl_cpp200-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhdf5_hl.so.200()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
