SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi3-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "529f117e740014c767d58e0e763f3e60343c353d7715fa276a33cd484e0307b21c8cd95ce43ec1a54dbda6d3d45a9c1237ee61e243a691b4d8a027c465017607"

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
