SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi4-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-devel-static-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "260d4c3550c3d5822a1a840f735ce38a7eb87b73c5bb3c25ca1b8988ca7181effb339e939c3254f17512adf2433457249d01849480d5113d76a1bb594afb8a77"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel"

inherit rpm
