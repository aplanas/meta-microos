SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "98bece89785fe32117ae695f4abbd488802976fe0609a58106a08b44947d690019c009879b793787227489e332a358ed27dc2213b09f8cfea156f26850b09f09"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
