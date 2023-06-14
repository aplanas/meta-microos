SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "acee248596ac51196e7641778d6d0bb704bd1bc8b7eed1b8ad60b0285013ffcab7b6949d667ecd012a4e6b5b99bd529136e8571088e353f287464ae9274acaca"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
