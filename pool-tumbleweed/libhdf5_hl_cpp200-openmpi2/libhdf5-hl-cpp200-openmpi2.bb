SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "946c58885e6935c82ee486e1e440159e0672c93f6baa7feaafcba30cc6f1b268d250a5b3b831aa64941853b534ab121de507a622908217ade4f58cf0be73e097"

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
