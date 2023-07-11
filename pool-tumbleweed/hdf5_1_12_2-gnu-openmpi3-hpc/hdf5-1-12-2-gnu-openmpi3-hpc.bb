SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "63339b32bd2c852bec84158170d8da763daa10e26434b39c2f229304f63e448c1d137b74f996ac4593dc96b709a268d6bb3b643c8face6d807b23cec18af2714"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-openmpi3-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi3-hpc \
libhdf5-hl-1-12-2-gnu-openmpi3-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi3-hpc \
libm.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod"

inherit rpm
