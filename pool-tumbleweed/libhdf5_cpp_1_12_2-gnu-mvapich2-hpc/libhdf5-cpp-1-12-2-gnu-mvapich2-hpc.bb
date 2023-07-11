SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp_1_12_2-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "563521f0a38fc6bf0a51b69f5081a45b9119d123b81d2c7b299c01c33a178d492c70b001148a4ed6cadca149fa5a95620adccdf45efcc2cca05ce3e3f8ff2783"

RPROVIDES:${PN} += "libhdf5-cpp-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-mvapich2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
