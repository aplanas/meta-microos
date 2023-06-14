SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp200-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "158133106cfe2bfd5b8115f82c50321c7f1af83e19b853f516e94e668fe0fe3dbad11ae5c2771bdd6973098244b0a5968e20c4c5fbb67cd9a32f0ce05bf162a7"

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
