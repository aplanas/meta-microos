SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "f60aa73e7cd077a4aa7cd2548c57c6f374fd69ac857452f29e34ef77aea854262ddbf9e19f31abe860595fe367dad47c3b0834309d9ee80227fec529a3b90ef4"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
