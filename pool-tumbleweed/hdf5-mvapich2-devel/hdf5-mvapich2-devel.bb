SUMMARY = "Development files for hdf5-mvapich2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-devel-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1c44823f18b6615d44e387a9f9f62aa405d46f2a4df79e5b2fb0fe42b2534c205333581a0a4dc1fa5e8dc1d0d96b07228f35cbc9fe19b418841eddb968b34fab"

RPROVIDES:${PN} += "hdf5-mvapich2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
hdf5-devel-data \
hdf5-mvapich2 \
libhdf5-200-mvapich2 \
libhdf5-cpp200-mvapich2 \
libhdf5-fortran200-mvapich2 \
libhdf5-hl-cpp200-mvapich2 \
libhdf5-hl200-mvapich2 \
libhdf5hl-fortran200-mvapich2 \
zlib-devel"

inherit rpm
