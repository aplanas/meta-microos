SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "90197c89cefdee5258f27d2a453c45accb53f006803d7f9a9d83d07deac0324f71722292d3c5223cbcf7b90834c4621001060145173fb6c6e495002e96a429f7"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
