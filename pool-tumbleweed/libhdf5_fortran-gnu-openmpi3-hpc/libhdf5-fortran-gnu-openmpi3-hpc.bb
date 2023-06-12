SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "360250a4352d7d4d1c7146a36866ba05ae18e610b7a2db10382ab640901620f01fd8120bf6983bd7198a9dba7c7439eac6ae4227091a181f6b5653ff344fe244"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-openmpi3-hpc \
libhdf5_fortran-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-openmpi3-hpc"

inherit rpm
