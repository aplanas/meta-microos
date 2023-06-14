SUMMARY = "Module files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "991186fab5d64025ca8d16d553d46d9b4755706eba9ac716850b9b6704d477b831e0af3ba0141134b58a26e6f0e1efbcc380e9480866399c5a327a01c49b0f50"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-module"

RDEPENDS:${PN} += "/bin/sh \
lua-lmod"

inherit rpm
