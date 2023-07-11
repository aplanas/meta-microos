SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "acbff651eefd8814d389f630d3d52f39488bab741c4458af58f64502ca736906e9dd68af6a1cc26146c2846ab304c2bd98060e1541ef919f1691ca9db7508a48"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel"

inherit rpm
