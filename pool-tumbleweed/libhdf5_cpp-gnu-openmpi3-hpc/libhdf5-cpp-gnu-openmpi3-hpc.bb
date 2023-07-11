SUMMARY = "Dependency package for libhdf5_cpp_1_12_2-gnu-openmpi3-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_cpp-gnu-openmpi3-hpc provides the dependency to get binary package libhdf5_cpp_1_12_2-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_cpp-gnu-openmpi3-hpc-1.12.2-5.2.aarch64.rpm"
RPM_HASH = "bf9169c8cb7c8a096f784555047381e6f0e6c8fbfa48372a0a35c5e5b227e55fdf33e734bf303cf4b8416ecbf0e5b6c13f76c49e2f45209e5ec60e356e11831f"

RPROVIDES:${PN} += "libhdf5-cpp-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "libhdf5-cpp-1-12-2-gnu-openmpi3-hpc"

inherit rpm
