SUMMARY = "Examples for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides examples of HDF5 library use."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-hpc-examples-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7195eacd2761a3d1c82ba844385325780e4f4481dfd725e58e602502d7a4f1171dcd96915e81e3afccda93742140caeca8294a2d14eebe7a0023c6d48f77a778"

RPROVIDES:${PN} += "hdf5-1-12-2-hpc-examples"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
