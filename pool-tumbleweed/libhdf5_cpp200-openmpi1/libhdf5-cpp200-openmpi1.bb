SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi1-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2de1f2de21db4dd07318b75e7bc4c1487d5db01d6a23e60834c3d97516937654a679ab64385290817dd4f30f0b82342a949a880dd03497820c222fe6d1817d17"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi1 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
