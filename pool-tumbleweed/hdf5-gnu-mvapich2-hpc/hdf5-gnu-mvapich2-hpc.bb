SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mvapich2-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mvapich2-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "62633caee273d3d5648d3a4987c341b48716c7116d9784dc1a45f6fe54097a043d472078f9e8e3b081ab1bd59f82b2fb1757fb9f1b4cfae4866b1506429f827d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-mvapich2-hpc"

inherit rpm
