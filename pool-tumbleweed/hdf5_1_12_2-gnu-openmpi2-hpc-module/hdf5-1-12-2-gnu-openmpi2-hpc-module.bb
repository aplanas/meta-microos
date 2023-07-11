SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-module-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "2e6a3ca627d6ca5bc060ff0f37e6679b7bc58ee588520bbb449bdee32ccb401d252dc3709cc09c8ef81667c6d4134e03889fbc65ef9edc6eeb43abc9f1edcfbb"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
