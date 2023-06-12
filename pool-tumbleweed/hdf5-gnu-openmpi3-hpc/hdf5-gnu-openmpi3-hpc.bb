SUMMARY = "Dependency package for hdf5_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package hdf5-gnu-openmpi3-hpc provides the dependency to get binary package hdf5_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "hdf5-gnu-openmpi3-hpc-1.12.2-5.1.noarch.rpm"
RPM_HASH = "9ac72128afa1b2e6312381a1ea83fad047dda28b045f5aba63bb42f1b0568df1ebe26ac25c89a3625590688a50d7f31f08b4ce02524e5c248a723d56b6b7d25f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hdf5-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "hdf5_1_12_2-gnu-openmpi3-hpc"

inherit rpm
