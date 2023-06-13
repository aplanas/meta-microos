SUMMARY = "Static development files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-mpich-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a147839c7dd2242aefe3f5a8b0bfd78122fa84872bd4a421dbbd584a18f32349a6dcbc25910ae4626d413b1396a4d77a75a8b56d94419b54295d7b69193b77c8"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-mpich-hpc-devel-static \
hdf5_1_12_2-gnu-mpich-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mpich-hpc-devel"

inherit rpm
