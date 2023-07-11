SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6167423db80b1106aa768e998f6d0efad6b8c298b71b4777810904ecc159ffb081ebe109667a0e7b0345d17f9d6cc777b95c69736871043fdf94cdae0ca3b3d8"

RPROVIDES:${PN} += "libhdf5-cpp \
libhdf5-cpp.so.200 \
libhdf5-cpp200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
