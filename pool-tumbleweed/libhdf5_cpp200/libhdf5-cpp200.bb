SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "dcd1ae22aac48731718f1622d42ee742d21881076862a92617896a90a6c839db88365b72e719a21e3b9e7bc1671ec4df01da9c33dd58e6e24edc285f6723ef8a"

RPROVIDES:${PN} += "libhdf5-cpp \
libhdf5-cpp.so.200 \
libhdf5-cpp200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
