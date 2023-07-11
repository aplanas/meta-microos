SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "406885ee17795a9eab661fc6d7c0f017c44c08f112f6a012d0a551ad54c462b1e00ea7299f58b64b9ea9f65afdd3a0072480773c96cfb70ee950e761d90377c6"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
