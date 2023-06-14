SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "4194276ef449f2cf33e9032213badf953bb97dd3e22348d19e4bc7d69a5fcdebe2dff1d99402300b0f8ce469ef2b83cc2e67f65b84193495e64d3300bddbf1a3"

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
