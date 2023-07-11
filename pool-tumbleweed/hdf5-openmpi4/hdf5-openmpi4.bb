SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the openmpi4 version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "5c3af4f9de67614d719959952d13475386c0c5572bb537276bb5f8627ab68bc8295314c11a819bf800dbd78f4ce12a672e74ae9c15021d0305604726c4627b24"

RPROVIDES:${PN} += "hdf5-openmpi4"

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
