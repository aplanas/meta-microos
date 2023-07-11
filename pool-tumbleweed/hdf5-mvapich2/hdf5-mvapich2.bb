SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the mvapich2 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "14f469ede18ffd55a4fa90a610ef17f6c3d115eddc4cbfa0b59f4c4d8fde340fe1ff7711af79e5613758d050019f6b64c17daeb600e8874e43ea989f5890482a"

RPROVIDES:${PN} += "hdf5-mvapich2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-200 \
libhdf5-fortran200 \
libhdf5-hl200 \
libhdf5.so.200 \
libhdf5hl-fortran200 \
libm.so.6 \
libmpi.so.12"

inherit rpm
