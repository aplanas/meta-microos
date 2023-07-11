SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "e2bed16d3623ffe40a94f8f3d8f5a7ea29edc03ff7d9773ced5df5e298eadf679c279eba9b6cdf92199f97fa2cffd1832b4daddee98d98a69e7c4dd3125625a8"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
