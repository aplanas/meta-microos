SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi1-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi1-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi1-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi1-hpc-devel-1.12.2-5.3.noarch.rpm"
RPM_HASH = "1d8c00e2235710749188e00b14eff9cf889a8fb7fc8614e3f727e605e7c3c8621add5eaa4c714620a7fdea4084f01d294ae1ddc39cce4df72698455708dd946e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi1-hpc-devel"

inherit rpm
