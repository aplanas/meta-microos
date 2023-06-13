SUMMARY = "Development files for hdf5-openmpi4"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the openmpi4 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ccad5c97eb398187bbe6837b68789e0b38a95499be9923ae45c14cf5cb09ed44a20efb3741cd102988ad5e12c2d3dc24339f3e39e20a101729d98731c0764b84"

RPROVIDES:${PN} += "hdf5-openmpi4-devel \
hdf5-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
hdf5-devel-data \
hdf5-openmpi4 \
libhdf5-200-openmpi4 \
libhdf5_cpp200-openmpi4 \
libhdf5_fortran200-openmpi4 \
libhdf5_hl200-openmpi4 \
libhdf5_hl_cpp200-openmpi4 \
libhdf5hl_fortran200-openmpi4 \
zlib-devel"

inherit rpm
