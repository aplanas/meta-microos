SUMMARY = "Static development files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-mvapich2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "51d0a45aa8aa9a9d73863c89a3d95133bec22ddccdcee8fae937ee8b54484f4c0733c05d160a1a0c23b9b63753c59959639c87b90e1bab64f82fdaf9f991b976"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-devel"

inherit rpm
