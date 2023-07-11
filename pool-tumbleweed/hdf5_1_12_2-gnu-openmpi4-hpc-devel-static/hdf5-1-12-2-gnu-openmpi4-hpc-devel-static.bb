SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi4-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi4-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "39f01553741604a026740ec8e269fa843b24e30ee2f4a81f3f32146a165f646d35305f971ea6f6d4b8fdc20f573eec01723bcbe720daf9bb86ede74f12760cb9"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc-devel"

inherit rpm
