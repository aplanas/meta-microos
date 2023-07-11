SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "84c97cce036edf3ef6bb4feec4a22acc08a72b7e72d8e753a9c6e9ec92fb603fc28fc5a856c2596f6ad4abd00f36ecc3e7c6dd1bc2ac014dd68508cfb0a865af"

RPROVIDES:${PN} += "libhdf5-hl-cpp-mvapich2 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
