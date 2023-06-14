SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "1372fbd4bdc7d982e13701c662a30ac75caa7cb4053c253e3f41c9bd92e1023f27b4cb161b8c1af60b3ab740839ff543c305d8c0d078d0c03202d2f9e4e7b353"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi2 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
