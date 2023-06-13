SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "1e7f74d349022582686e26e17da419fdc40fe8cba0c7dc9aeb219bfa961f5f27ab803dfaee45fd3c50f4a4b76be17e8d8a7b2c045c29b8ad50046164cf5c3df5"

RPROVIDES:${PN} += "libhdf5_fortran-gnu-openmpi4-hpc \
libhdf5_fortran-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_fortran_1_12_2-gnu-openmpi4-hpc"

inherit rpm
