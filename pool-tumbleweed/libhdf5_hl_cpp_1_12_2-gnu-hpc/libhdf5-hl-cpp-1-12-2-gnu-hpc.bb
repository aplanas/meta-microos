SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "15cc1dee013f2ce5b3e3dc8dacea0e73c4a5073355f07066afff223c87358b93d1e508caf53ab25cab50975582be1e38dbd529ae2fdb12d1fcc8630b40955da4"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
