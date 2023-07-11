SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi2-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi2-hpc-1.12.2-5.3.noarch.rpm"
RPM_HASH = "2030882ee7c9ab618719becdaeb0cd71c3cdd958394dc9e13c64f085726246cc226621453e31c9f1bc367f95b053e8017473ed6959242f21046f9e7ff582d828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi2-hpc"

inherit rpm
