SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-mvapich2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "37fb71b529c88f890d2df5043c3ead79ebd58c4b56132fbb4f4a857899d30738b9d72bc079b3792abb676ea1df9528a22330dded6cb20d30c23f15c327096865"

RPROVIDES:${PN} += "libhdf5_cpp-mvapich2 \
libhdf5_cpp.so.200()(64bit) \
libhdf5_cpp200-mvapich2 \
libhdf5_cpp200-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
