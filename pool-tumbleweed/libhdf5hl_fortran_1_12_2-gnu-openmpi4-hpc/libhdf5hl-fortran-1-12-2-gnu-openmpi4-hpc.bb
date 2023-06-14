SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi4-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "834b690f1fa3852e4e7c31b484122e656e49c21ed9612fd5adf0891387722783b4c984602b6c15785e563e8428abda5777e9438af905894741809cc96c4ec69c"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi4-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
