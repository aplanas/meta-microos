SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi1-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi1-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi1-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi1-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "dbd4315112664d0e32d33ed4d3ee94ef8d936ff92c3ba2be0eac1e9c5db51e111ad63114089e253cee6795ec7e135db40a16708eb67feec426acbb6666ac745c"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi1-hpc"

inherit rpm
