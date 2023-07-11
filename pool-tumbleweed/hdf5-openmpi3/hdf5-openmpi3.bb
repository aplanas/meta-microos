SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi3 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "79ef498f74b7560f59cfd1a73c6b819216e376c091809704e775baa4c7af2a7d25a422da890e79487e3fdc4a868e295651e6e7b0e5a421824b33f65756922f6a"

RPROVIDES:${PN} += "hdf5-openmpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
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
