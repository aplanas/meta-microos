SUMMARY = "Static development files for hdf5-openmpi3"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi3 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi3-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "4b633ecfccfa93ba9f8d77e4945eaf74751f08cc7b3c4b04430dd8314ab37ceabf2f40393398dce69b001bff29b0f79ce3ea1bbf566508aa7b9cf0f94324c3c9"

RPROVIDES:${PN} += "hdf5-openmpi3-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi3-devel"

inherit rpm
