SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi3-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-devel-static-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "13dd38c6c11664f0ee33730ba18c550c2b6ea7491274da1d168f785c9a9995d6e669947d59e093e1793e704ef14af6b2693ef0f110a23e482fe9af1ba4c46c2f"

RPROVIDES:${PN} += "hdf5_1_12_2-gnu-openmpi3-hpc-devel-static \
hdf5_1_12_2-gnu-openmpi3-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi3-hpc-devel"

inherit rpm
