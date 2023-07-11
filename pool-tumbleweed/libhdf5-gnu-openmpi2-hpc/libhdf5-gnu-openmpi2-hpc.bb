SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "0be86a95c5aa8e131277cf061fd62d45b23b7a2d6089323a251f20fbff201a53b5771b43a9897668e12f6a0b99be4ccc6c11d6022898bd67735810a5e3b3eda0"

RPROVIDES:${PN} += "libhdf5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-openmpi2-hpc"

inherit rpm
