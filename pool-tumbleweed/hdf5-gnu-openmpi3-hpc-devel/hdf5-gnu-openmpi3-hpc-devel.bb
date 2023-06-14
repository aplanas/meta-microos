SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi3-hpc-devel"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi3-hpc-devel provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi3-hpc-devel-1.12.2-5.1.noarch.rpm"
RPM_HASH = "e823a8c1177a0345682901ff838aa754966416081d5f64d826b2891b4bda1d3914924f45644102877ce3fd92e862ac9f9d9a30e045ad22299c7afa0d7454dc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-openmpi3-hpc-devel"

inherit rpm
