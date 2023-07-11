SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi4-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi4-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "2d9285a6b05c190e23fbd554786628f5e2b7f5219f6b322f2aa68b73dbbc87753b8ab576e1b0412f4931e77a37c620a194861043ee429d06d358fee7362d33c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi4-hpc"

inherit rpm
