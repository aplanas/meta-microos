SUMMARY = "Command-line programs for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version utility functions for working \
with HDF5 files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "4b96ac7482039c3eb4c0d4b35f9ae54380384ae00353fd5939664132d34982f72c7f692ae8631e6e2eb40ecf60042aa0145d052705be9c6d4785e3f74a73c848"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-1-12-2-gnu-openmpi2-hpc \
libhdf5-fortran-1-12-2-gnu-openmpi2-hpc \
libhdf5-hl-1-12-2-gnu-openmpi2-hpc \
libhdf5hl-fortran-1-12-2-gnu-openmpi2-hpc \
libm.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod"

inherit rpm
