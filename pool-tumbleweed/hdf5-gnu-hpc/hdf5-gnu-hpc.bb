SUMMARY = "Dependency package for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-hpc-1.12.2-5.3.noarch.rpm"
RPM_HASH = "b9f19fbd97f6c131c9a5ae206796ac030171f20d8dd109f91db8b90b0eaf82690908b4628e88c32c77588a6035d5a64dd9fdf97b845ebeb62438412b373ad3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-hpc"

inherit rpm
