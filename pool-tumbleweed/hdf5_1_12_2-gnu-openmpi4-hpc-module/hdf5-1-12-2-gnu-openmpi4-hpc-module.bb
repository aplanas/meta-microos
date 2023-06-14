SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-module-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "3564e84f4a3851797870f4e1f3cebd48f9a2c17bb08619716d28262014183c3100d92401b71e0b66484b03daef145e95fc50124342725ad6b10d4274aaa80172"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-module"

RDEPENDS:${PN} += "/bin/sh \
lua-lmod"

inherit rpm
