SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "83d8db4e50baf436631d9958e78f9e3e6f00034c8ed2f8d90b3f35cc08a431a8379773328340352be6e77f9b5c013efebd05096e27136a2deb2d9a83a459e9d4"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi3 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
