SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi2-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi2-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "ba572069ae70884e04337700ce0e007dcf880973fd3045936f396823b47921c55aec20e4c5f1861f0dac09bb653ae6df6390d712da64c0c648a89fb6008dacd8"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-openmpi2-hpc"

inherit rpm
