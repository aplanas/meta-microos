SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "f6068485afdd362c745cc1e5a05164e6d55fdb650718dfca70bdfb210873865a44c87efabae87e8b44aa53cfdef566cb7f5531e293239f980b5c703a611288b3"

RPROVIDES:${PN} += "libhdf5-hl-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-openmpi1-hpc"

inherit rpm
