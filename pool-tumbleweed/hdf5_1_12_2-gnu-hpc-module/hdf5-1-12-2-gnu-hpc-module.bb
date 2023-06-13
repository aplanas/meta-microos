SUMMARY = "Module files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "94e66da55d8d05b34255cb2be40d53d7ffcb34348c0d18162bcdde04c6c5bf33af78ae8319de6f1cb1b1a14c49e6e4ff33f9b8a0f44de69a16eff0da139f31d0"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-hpc-module \
hdf5_1_12_2-gnu-hpc-module(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
lua-lmod"

inherit rpm
