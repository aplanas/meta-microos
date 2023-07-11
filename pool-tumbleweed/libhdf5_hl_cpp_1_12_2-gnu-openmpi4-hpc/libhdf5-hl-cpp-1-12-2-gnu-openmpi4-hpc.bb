SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "982fc5c73909868d12072b2f49f5e84eb68d20bee8982c2a85b98de6f0f37c0d4154861f328290190a385f84db76cc6af05d93c7438554306623cb69689b3bae"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
