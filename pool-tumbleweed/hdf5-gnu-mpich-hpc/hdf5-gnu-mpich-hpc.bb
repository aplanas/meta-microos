SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mpich-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mpich-hpc-1.12.2-5.3.noarch.rpm"
RPM_HASH = "53bf539a98791d289646b8b9dc02025d13864278cf98524d07da1eb7902c52897e6982cb1c6003516bc605a5d04e851a999370f178adaf023dc21ad352f017fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mpich-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mpich-hpc"

inherit rpm
