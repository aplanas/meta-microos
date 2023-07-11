SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "8e38e7e37febfb9663b87f317164d87eac55dcb32aa2f57e6c12a23acdf5cc5ddb4af15a5c4354b140962e492253f49aa2db6aacbdb49d60b248f13b36470f91"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi1-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
