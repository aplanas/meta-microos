SUMMARY = "Dependency package for libhdf5_1_12_2-gnu-mpich-hpc"
DESCRIPTION = "hdf5: Command-line programs for the HDF5 scientific data format \
The package libhdf5-gnu-mpich-hpc provides the dependency to get binary package libhdf5_1_12_2-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hdf5_1_12_2-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "libhdf5-gnu-mpich-hpc-1.12.2-5.3.aarch64.rpm"
RPM_HASH = "773868d2cfa3cff54d3c291560221fb6c1b0c3de8516f644f71a530605775f5b8e126690c77dfb90f2fe7719f29aca9f13d1bf3af65336773245db0e81c992c7"

RPROVIDES:${PN} += "libhdf5-gnu-mpich-hpc"

RDEPENDS:${PN} += "libhdf5-1-12-2-gnu-mpich-hpc"

inherit rpm
