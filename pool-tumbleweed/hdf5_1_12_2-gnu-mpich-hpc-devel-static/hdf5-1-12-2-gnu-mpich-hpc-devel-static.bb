SUMMARY = "Static development files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-mpich-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "42d723758e5c5b0ebe723c3abcebcaa077ea9fa76d7216514dd3d745c14215367a6b2f89c316c35d2166c0f167782d65a72cfd4c7fab0d8f5d9b721b5029eac9"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mpich-hpc-devel"

inherit rpm
