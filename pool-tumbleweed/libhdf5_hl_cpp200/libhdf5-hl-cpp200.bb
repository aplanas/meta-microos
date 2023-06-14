SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "d70be7784513128c184fb2f614470b7036fc6b07c719434c86dcde4f587ca67d50b0e5e480aaec4749bf049fb0e1058baa5c31a940e0bd0fccd69b86475594e1"

RPROVIDES:${PN} += "libhdf5-hl-cpp \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
