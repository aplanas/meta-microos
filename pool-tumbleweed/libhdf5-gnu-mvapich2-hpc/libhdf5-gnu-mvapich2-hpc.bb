SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-mvapich2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1f3ada7af8783aa15389ff3c2e95be9553730c37b9010db001e85f423d15ce554184a8c5fafc9683443be5d69faf8e501006286ddb6f36f08e722f8b3928e42a"

RPROVIDES:${PN} += "libhdf5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-mvapich2-hpc"

inherit rpm
