SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "b9c4002fb63954c6783e79d572c936906294b777051bf36404c5e14fd3a0e3ceaf290fd4841d99ecf8d6264fcb60ca6507a1cd93421e3a1c7a4a798083f20248"

RPROVIDES:${PN} += "libhdf5-hl-cpp-openmpi1 \
libhdf5-hl-cpp.so.200 \
libhdf5-hl-cpp200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5-hl.so.200 \
libstdc++.so.6"

inherit rpm
