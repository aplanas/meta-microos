SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc provides the dependency to get binary package openmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "5710d031500f01d3b26d7e18e1c02997059444cf7a850761187aa137ebdcd65022eb6dfd44c0c3be3adb42e34a73c6d167bfe90d908e855eac58ba55ec71596e"

RPROVIDES:${PN} += "openmpi5-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-5-0-0-gnu-hpc"

inherit rpm
