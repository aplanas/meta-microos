SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi1-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "bda62e93707839df250c40dc379d0f459124e1a9df43aa5d0546cb6d5f89dbe59b8d7f88816200e025edf73258d929a377e87d1abd5e782783fbce10f82da910"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi1 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
