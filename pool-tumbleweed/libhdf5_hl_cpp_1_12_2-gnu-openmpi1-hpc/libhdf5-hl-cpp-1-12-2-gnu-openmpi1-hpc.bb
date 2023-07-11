SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "d64aefe6476c69b19071ef468693882ca4a0e0dfd1dcfca463b965250216f61c6c08355fc206251ed98a19d720fc0632b763d79d388e9fdb87d59a23f2d1667e"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
