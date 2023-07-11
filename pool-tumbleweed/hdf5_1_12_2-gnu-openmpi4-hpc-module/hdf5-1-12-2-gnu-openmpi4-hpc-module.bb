SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f141a07923039a0f8c5a5e9142899e40b1e696679d628cb2bafb347bdf24d3049f50b1ef9df70052465790c0fd4e82ed0288fd75951d047c3aa8fa60512970d0"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
