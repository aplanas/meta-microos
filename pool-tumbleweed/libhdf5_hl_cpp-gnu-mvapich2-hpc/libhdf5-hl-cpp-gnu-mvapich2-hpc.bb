SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-mvapich2-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-mvapich2-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "a3433076837f91d1ded4a20963a279d92b5c39aeb62b9df7eac7dd0d01aabc118d699a2acad3c4c3fc858d472d17560c206a159a5842ee7fd707165114f7d1bd"

RPROVIDES:${PN} += "libhdf5_hl_cpp-gnu-mvapich2-hpc \
libhdf5_hl_cpp-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-mvapich2-hpc"

inherit rpm
