SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6fc2f1437ee1c4b7e5a4fb8bd1691a18051f54cd3713d0f07816d3a34215cc90ad4cfba2d87e178d63fef11968bc958e56701a28882232889ad6baffe7132adb"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
