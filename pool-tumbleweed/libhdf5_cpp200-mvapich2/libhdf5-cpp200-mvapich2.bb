SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3d5eaca3791992f9efbd7b221524c7c07c565c7602090389a48f6886ede4a841e5debcd788954136bc1efda96a34d4fd7a9ba42667b5e686a493cdb0614c3cfd"

RPROVIDES:${PN} += "libhdf5-cpp-mvapich2 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
