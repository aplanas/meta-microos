SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "01a7a893181b41415e94fc9e672b1d55bdb460427c43215b5bac9bd24ae9e685173d93d663a5a58bfc41be121041fcbaebf8c6d74936f12309d1465592bd8ae6"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mpich-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
