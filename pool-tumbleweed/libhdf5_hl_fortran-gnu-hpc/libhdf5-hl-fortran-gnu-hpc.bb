SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "01af3eae30bd3acb694a550bc22a92b6c8c5177820adda6104afa145c8c0b4e791cb77de476a6843f94af945030b7fa20a94f3c061b79afe4f8702c68ef9fe5f"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-hpc \
libhdf5_hl_fortran-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-hpc"

inherit rpm
