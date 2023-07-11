SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "14599ef4c5e6068860a246a18de50a6dd7b5b65ad99ecb540f6948ee51f826332782dd0614a316d4c69f5ebdc30fee4deff4ff29b7987e624b08e81d6fdb59b6"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
