SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ce2f958ce3cc844d823b3b555fd7ba13cbf74b90a6b7a4cb8e785e000f9da2c24fe6a4104271582fc182d7fbfa7b6c63f23c88b6755203ee8249f947bb20a143"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi3 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
