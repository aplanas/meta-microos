SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-mvapich2-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "5c412adfa1a96d90a1bfaf59b21a597ad9a3a6101de8228a15daddc4545ce4c45719db2567d3ccfd9ee1d7479bc968ec33208af4b80fa09dca4f3a212f020555"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-mvapich2-hpc \
libhdf5-fortran-1-12-2-gnu-mvapich2-hpc \
libhdf5-hl-1-12-2-gnu-mvapich2-hpc \
libhdf5hl-fortran-1-12-2-gnu-mvapich2-hpc \
libm.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
