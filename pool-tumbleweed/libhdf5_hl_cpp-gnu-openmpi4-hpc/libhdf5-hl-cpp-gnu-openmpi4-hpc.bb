SUMMARY = "Dependency package for libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl_cpp-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl_cpp-gnu-openmpi4-hpc-1.12.2-5.1.aarch64.rpm"
RPM_HASH = "3fea1906c2b63a31cf77e15620b04a1cbe1e671c9383d2f23ec69483998ce1f07d68e03c8f136b63d3a31f945e5d3875a849391bd74d8b539e4b5e0cb51a7d0d"

RPROVIDES:${PN} += "libhdf5_hl_cpp-gnu-openmpi4-hpc \
libhdf5_hl_cpp-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "libhdf5_hl_cpp_1_12_2-gnu-openmpi4-hpc"

inherit rpm
