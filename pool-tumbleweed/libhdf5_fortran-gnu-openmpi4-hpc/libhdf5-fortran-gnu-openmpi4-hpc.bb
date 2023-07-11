SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "ba5c179f03b9ae481c85028dff8c8d14afc05ec32607119199563f474860cd30c38aab7102cc0e78ed46a50cdc69f6011bf2f8d72cf99282d793af2e68c40d07"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi4-hpc"

inherit rpm
