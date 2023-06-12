SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-openmpi3-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "1b71a19a9806d48c823276a0b5fe38aa2b8026a6d2def91cc543b92f95e3a62fbdce4cbf0ab1d871f2ed9234ae10de197fb4a8450f4b5b6ff57f0a166c52925c"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-openmpi3-hpc \
libhdf5_hl_fortran-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-openmpi3-hpc"

inherit rpm
