SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "934d272346c33a24e28d2b833946c182fff1573c10b3dbe2aa1ba648c16502e2be5305e83b7347096acb9c12c621246e5160aebc24f5fcdc9a031ecf4a6e3a27"

RPROVIDES:${PN} += "libhdf5-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-hpc"

inherit rpm
