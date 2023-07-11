SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi4-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi4-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi4-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi4-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bd7e139c51ef3f8ff78e7b08766bcc8cff0ea4dcc45876fefd7840756d1f55e515b74e4263806855e2c63380d9d4806b17f0ef4887d76eb96c9ed81f3fccfa55"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi4-hpc"

inherit rpm
