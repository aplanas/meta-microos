SUMMARY = "Static development files for hdf5-openmpi1"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi1 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi1-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "0ff52fefc20bf326d22493da06a762a4d0f5e79debb43f46ab2c25f81fe345f83937dc0cca22ad0e76952aee24b609c46a16d0ea66c3297e366d2e111ac54415"

RPROVIDES:${PN} += "hdf5-openmpi1-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi1-devel"

inherit rpm
