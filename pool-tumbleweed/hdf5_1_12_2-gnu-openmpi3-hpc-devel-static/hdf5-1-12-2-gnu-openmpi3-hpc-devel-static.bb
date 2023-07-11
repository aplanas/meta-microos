SUMMARY = "Static development files for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package provides the static libraries for the gnu-openmpi3-hpc version of HDF5."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi3-hpc-devel-static-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "efa27fde34a10bc52fc6074d3adca3c2e9c2d895455217f1edb6463bfc9ff96d88a819f1b49b8f269ec7caa486394fbc9848ba095c35dd1c4860d4eb8f05d2ab"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel"

inherit rpm
