SUMMARY = "High-level shared libraries for the HDF5 scientific data format"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the gnu-openmpi3-hpc version of the high-level HDF5 \
runtime libraries."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "8b1e40e1d93cf8a54ca252b3950f901fb89784a1cbe5b0d37e62cfc594eda906123797e018a55ea02f42c3c993462a242d199e485324339d5c0d4d5fb94b7d96"

RPROVIDES:${PN} += "libhdf5hl-fortran-1-12-2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
hdf5-1-12-2-gnu-openmpi3-hpc-module \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5"

inherit rpm
