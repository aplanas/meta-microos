SUMMARY = "Dependency package for hdf5_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-hpc-1.12.2-5.2.noarch.rpm"
RPM_HASH = "640528cca7a58f05e8fce03df3e7d73f8ea2eaf6c5ad1996b90aebb43c97ca84db555d54edd3617c5e9d4c96f787170cf40ef3e19b9d9f429c801e0254c47649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-hpc"

RDEPENDS:${PN} += "hdf5_1_12_2-gnu-hpc"

inherit rpm
