SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp200-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "c50178b9283f9e00f424e72bcf3bf905a9f4e0b7939ad4b2a654cc21efd524919107cff5f8b7d4b5cf93fa5ffe7a73a1d36e11bc528adc212677fc395cc12620"

RPROVIDES:${PN} += "libhdf5-cpp-openmpi2 \
libhdf5-cpp.so.200 \
libhdf5-cpp200-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.200 \
libstdc++.so.6"

inherit rpm
