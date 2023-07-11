SUMMARY = "Dependency package for libhdf5_fortran_1_12_2-gnu-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5_fortran-gnu-hpc provides the dependency to get binary package libhdf5_fortran_1_12_2-gnu-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5_fortran-gnu-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "1e831c2fdff71ee22a0f62c50efbb2d6ff46fe8a4518391c16fc013864cf3af092aaf858e46fc208c31fdab71c2c6da24f560ad759d8be4a6826e4c18b3adc92"

RPROVIDES:${PN} += "libhdf5-fortran-gnu-hpc"

RDEPENDS:${PN} += "libhdf5-fortran-1-12-2-gnu-hpc"

inherit rpm
