SUMMARY = "Dependency package for libhdf5_hl_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_hl-gnu-mpich-hpc provides the dependency to get binary package libhdf5_hl_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_hl-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "379f97e42ad807ca7a6ac6e80b4ef68e588cae46eea3f2b284d8d10e1cd86997d7860d491342ceba3b610539288992a1b7150f02776f031c2a2ef7323937f64a"

RPROVIDES:${PN} += "libhdf5-hl-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5-hl-1-12-2-gnu-mpich-hpc"

inherit rpm
