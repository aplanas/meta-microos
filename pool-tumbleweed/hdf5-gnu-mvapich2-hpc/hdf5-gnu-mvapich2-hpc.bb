SUMMARY = "Dependency package for hdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-mvapich2-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-mvapich2-hpc-1.12.2-5.3.noarch.rpm"
RPM_HASH = "0cf2585c8807b650d1a8971789c5c0000a8860d73aa802e4712c48207f84a03ff5b17aa946707491b0bdf173b9a99cc7d2cdd837c17bde6ab161627c337825f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "hdf5-1-12-2-gnu-mvapich2-hpc"

inherit rpm
