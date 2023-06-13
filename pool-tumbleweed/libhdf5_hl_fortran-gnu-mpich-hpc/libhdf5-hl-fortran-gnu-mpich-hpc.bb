SUMMARY = "Dependency package for libhdf5hl_fortran_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_fortran-gnu-mpich-hpc provides the dependency to get binary package libhdf5hl_fortran_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_fortran-gnu-mpich-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "f3f8d0c45af608fc9eebd84743007cd71431bf20330457e523b3b146ff402d37f0f03e331b976125c4bfdafbcb9673d48890b83aa4c7c5a586b01752d58fd056"

RPROVIDES:${PN} += "libhdf5_hl_fortran-gnu-mpich-hpc \
libhdf5_hl_fortran-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5hl_fortran_1_12_2-gnu-mpich-hpc"

inherit rpm
