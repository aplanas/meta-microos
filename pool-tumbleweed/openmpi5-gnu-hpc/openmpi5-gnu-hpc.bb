SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc provides the dependency to get binary package openmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "ed17bb874b9a412bb3eb05f4c49888c4377fa5f600096d000ee14b2609aa92723dbeac2b842cad00acf34a96a8480eb0ce094ff304af311f45645bd0bba1e419"

RPROVIDES:${PN} += "openmpi5-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-5-0-0-gnu-hpc"

inherit rpm
