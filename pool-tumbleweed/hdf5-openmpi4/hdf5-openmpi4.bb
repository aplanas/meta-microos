SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ed70b9f87491ce99726cde7cfe6606c51dcffc43eb56318906ab6930a5ddf7e0e8a6dc2f172f4094532a44abcae9255f68d2aa8c5d58d7304f5843c610aa83e0"

RPROVIDES:${PN} += "hdf5-openmpi4"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-fortran200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200 \
libm.so.6 \
libmpi.so.40"

inherit rpm
