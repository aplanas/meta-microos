SUMMARY = "Static development files for hdf5-openmpi2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi2-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "fc0419e5e194317d1e4f066f30b8892665449fe11434d65fff8203d9d3d69154181585aa1938f9d0054ca05b343e347ea8faeb28dd9498edeb25aeca9d0ce1aa"

RPROVIDES:${PN} += "hdf5-openmpi2-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi2-devel"

inherit rpm
