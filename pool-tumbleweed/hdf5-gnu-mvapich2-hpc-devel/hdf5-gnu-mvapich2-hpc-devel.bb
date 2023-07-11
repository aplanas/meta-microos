SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mvapich2-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mvapich2-hpc-devel-1.12.2-5.3.noarch.rpm"
RPM_HASH = "07318ee28b700bf7dc0cc7a7f13617d6ed6fb3ef9ecee4c9e04ca29e9c9139d0ae973d4390fa3e0d681cf08204ad929373cd17bb18ada528092572cfc55d6873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc-devel"

inherit rpm
