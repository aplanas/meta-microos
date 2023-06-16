SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-module-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "0932fdc167edb4a9b9eb72c323e0d5902c50890958148ea4ca090e769898f9ef276c2aa16377746a039dac9cf7bb7aa5196f10d2cc5b5cf1372c98a65b0c6281"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
