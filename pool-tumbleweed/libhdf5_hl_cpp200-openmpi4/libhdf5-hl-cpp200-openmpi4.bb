SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "a388d0c8203cbe91a6ec64cd02937068f2c56d05ede67352ed44a4fd738d24cd4a68a40899c7bb48eee65302ec0f8d53cdc9e9669392228faa4f6cb76843c522"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi4 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
