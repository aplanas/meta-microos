SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi2-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi2-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi2-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi2-hpc-devel-1.12.2-5.3.noarch.rpm"
RPM_HASH = "97826ea5fa217b19a6e696141920a56513a606119025846acb71f83d4e3865509a8f79862e0058f533a0d7927dd6345062678ca0510f96afcf1a06eb695b1658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc-devel"

inherit rpm
