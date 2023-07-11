SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi2-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "53910b72795a20e1a04a1830ab496a54a2e69d69e989e7c7572ffd465676a1caf7ef055ceba325a59e1da9962eb6bb111e3a6ece914536dbe63dce69ba84ae8b"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi2-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
