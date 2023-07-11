SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi2-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "a6e3f26f88bbb8ef29e5f6364889431a0009dd493a960b1bb0639e8d84c71ee9fbdbc20652fca2d695c7585523151550f03bd7e06c641933067238eba9d614bb"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-devel"

inherit rpm
