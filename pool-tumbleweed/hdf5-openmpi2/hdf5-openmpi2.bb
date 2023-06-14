SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi2 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "22bcef97c90c9824098d0e8500f51ff6f68199859da2b9c4ec1e24554fb758f408c77f9065c7528bf0f40414c9024c8e3b7a1207aaf939bef5124391b39ac6c1"

RPROVIDES:${PN} += "hdf5-openmpi2"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-fortran200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200 \
libm.so.6 \
libmpi.so.20"

inherit rpm
