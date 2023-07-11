SUMMARY = "Module files for hdf5_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "HDF5 is a data model, library, and file format for storing and \
managing data. It supports an unlimited variety of datatypes. \
 \
This package contains the environment module needed for the HDF5 \
library packages."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5_1_12_2-gnu-openmpi1-hpc-module-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "b441ef7d544561bf8155af3688319c17dfca5b21cb79e59bf2981c2bf8e5297740167369868825002bd85c0a6bfc0bfd4464c5c253817dde7288d54c8f256e4f"

RPROVIDES:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh \
lua-lmod"

inherit rpm
