SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "2aac88ee10f9a655871ba5f8536394522604cfe2e6f5150a59ba0d8e82530b57059a1862ef2349413154cf816615e73dabdea9ebc257d43aa99a61175c142bd2"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
