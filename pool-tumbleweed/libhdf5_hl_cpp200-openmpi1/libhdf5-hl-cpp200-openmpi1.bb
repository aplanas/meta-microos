SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "1c6e811725b391dc5e8a50488e702f65dcff306442f53f7b850604113c3a6d2ceb1c01447dc36cd681035cb75a111fb784479abcadb33913a41f5c813ee6ed9e"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi1 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
