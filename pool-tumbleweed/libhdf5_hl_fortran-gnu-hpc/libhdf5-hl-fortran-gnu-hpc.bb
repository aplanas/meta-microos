SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "7161c006be20fb49e19bf3c37aa7b611c84d80fe613178deb3ef08c74d58b5dfbc5409ff2c6f5fc5661ab6f05215d4e5f43351d2d8635c9379ebfdc42a2e9d03"

RPROVIDES:${PN} += "libhdf5-hl-fortran-gnu-hpc"

RDEPENDS:${PN} += "libhdf5hl-fortran-1-12-2-gnu-hpc"

inherit rpm
