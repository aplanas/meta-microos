SUMMARY = "Static development files for hdf5-openmpi4"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the openmpi4 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-openmpi4-devel-static-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "538730c400f3930b20c052ac2bd9e058c4013a64d8580ef408aa601565f39221553fe77c9d18be7f3cfe3ff50e9a8e067b37de8542a6ca9b7b7e94ffcd4b77ed"

RPROVIDES:${PN} += "hdf5-openmpi4-devel-static"

RDEPENDS:${PN} += "hdf5-openmpi4-devel"

inherit rpm
