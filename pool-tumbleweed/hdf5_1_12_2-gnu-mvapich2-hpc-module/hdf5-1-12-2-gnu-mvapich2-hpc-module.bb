SUMMARY = "Module files for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mvapich2-hpc-module-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "dbf7f060dc8c0183275351ff310db4a5876701462c934f74b20e5f9d04a679c42e0c34033cc0e3e55e783c43c88423f4590facb23afc404fd4074c57c3ff81e1"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
