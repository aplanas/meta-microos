SUMMARY = "Module files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "0911127bf7adedb5273f26afb2d7a26f0142b4e0a0d575bc8707659b50a670979c611cc9be84dd791ee9552fa98c81e6cb363ed5a9985269ce0bf5d8146688d8"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-mpich-hpc-module \
hdf5_1_12_2-gnu-mpich-hpc-module(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
lua-lmod"

inherit rpm
