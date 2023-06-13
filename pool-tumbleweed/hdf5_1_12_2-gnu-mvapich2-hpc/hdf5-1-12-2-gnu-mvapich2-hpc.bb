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

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-mvapich2-hpc \
hdf5_1_12_2-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5_1_12_2-gnu-mvapich2-hpc \
libhdf5_fortran_1_12_2-gnu-mvapich2-hpc \
libhdf5_hl_1_12_2-gnu-mvapich2-hpc \
libhdf5hl_fortran_1_12_2-gnu-mvapich2-hpc \
libm.so.6()(64bit) \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
