SUMMARY = "Module files for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-hpc-module-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "3f428e2a77246f763ce6f44bda60c5728c208d9efac07c62f8c2f8d37d32a2522d5c93ebace571d8bfc6f172a4e44b452ed9795b3699f85657e03853f50fe7ae"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
