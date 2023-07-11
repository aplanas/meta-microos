SUMMARY = "Shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version of the HDF5 runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-200-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "f1940a633d9432366d9d9790ea0c04ae51e7f6df085f8b638dd0c5e498176bce9ddee9efad29e5bdf06d3fe1915c001d7c6db126f4384cbd88e185f452032ee9"

RPROVIDES:${PN} += "libhdf5-200-openmpi4 \
libhdf5-openmpi4 \
libhdf5.so.200"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40 \
libz.so.1"

inherit rpm
