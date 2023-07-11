SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "623e4b62351108658fbd1727e1d00f934a96d03607446b1356c131e55a08c79dda0bd937c1ded0ae9388a7886315917d875cab3bc4c527ff9186dff6045ca92b"

RPROVIDES:${PN} += "libhdf5-hl-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-hpc"

inherit rpm
