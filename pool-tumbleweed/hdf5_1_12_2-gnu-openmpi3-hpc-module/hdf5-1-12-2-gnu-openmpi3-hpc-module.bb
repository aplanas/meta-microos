SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "66538c025f1a084fc343b3265487b601158dbcabcafb995ac6827596d4715dec39088a7901306f28b2b9b6843d96de0bd8efccbf61f9646ac81a07f296798a7d"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
