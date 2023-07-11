SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "76c99d91e2375b467edf4a8638149aa587135f0366c310990bd20dfa12081fa0aaad822af25a9325db9e69530d54be7a0714dcb8e8d56660ca65ff011e979e18"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi2 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
