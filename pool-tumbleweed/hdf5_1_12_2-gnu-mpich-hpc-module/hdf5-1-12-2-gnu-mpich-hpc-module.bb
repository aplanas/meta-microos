SUMMARY = "Module files for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-mpich-hpc-module-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "6f0a34bdea7a90dd16be09af298911a15a5d116003c3ee314b6d084822366c38877e893f9cf036925b982c9e429053b444c3d45655ba007dda639c2b91857971"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-mpich-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
