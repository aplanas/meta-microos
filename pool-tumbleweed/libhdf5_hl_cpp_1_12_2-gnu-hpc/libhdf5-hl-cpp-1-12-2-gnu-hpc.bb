SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the the high-level HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp_1_12_2-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "f1a20cc8e5e8440a9d4baf60a4ef1086e0ec2d8c7fb97ee68f8cb3e845e6499a616ac8c4762ce520e5a6e2511a81eb9ddfe531a55ef4d18a327efa9c989a05d9"

RPROVIDES:${PN} += "libhdf5-hl-cpp-1-12-2-gnu-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
