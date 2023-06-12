SUMMARY = "Development files for hdf5-mvapich2"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains all files needed to create projects that use \
the mvapich2 version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-mvapich2-devel-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "b9ed26d9d128a91692177c70a52deff48fb0b05205c0a76705093307b046240ed14c8a976bedacd1128d833fb4c1c378f336bfc9b08195e4b083f3ef2aa78b2e"

RPROVIDES:${PN} += "hdf5-mvapich2-devel \
hdf5-mvapich2-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
hdf5-devel-data \
hdf5-mvapich2 \
libhdf5-200-mvapich2 \
libhdf5_cpp200-mvapich2 \
libhdf5_fortran200-mvapich2 \
libhdf5_hl200-mvapich2 \
libhdf5_hl_cpp200-mvapich2 \
libhdf5hl_fortran200-mvapich2 \
zlib-devel"

inherit rpm
