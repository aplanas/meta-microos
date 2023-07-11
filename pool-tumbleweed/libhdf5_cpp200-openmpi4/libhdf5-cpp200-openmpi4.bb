SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "ec83c167cdc5d58eeb027cea8bb2706220f7c1bf8b46e6d6c117fa17e6069a779462f82c47f2234c2e7a6b8b75ff28bc39624afc05a6fe8fed5cba3836e504c5"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi4 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
