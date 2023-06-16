SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi2-hpc-module-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "e8cb7b24ed9ebdfc7c50a8887245e37edaea393b7068e55a55c7171fe69dc6f2ddcf1e075785cc415c4f557a23a5fe120483750230dc12f861e24a2952f23c89"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
