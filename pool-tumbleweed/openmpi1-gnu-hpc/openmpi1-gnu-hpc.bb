SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc provides the dependency to get binary package openmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "0bbfd1875518bd520e83e72026862d711e2fa7f838a048b28697f9cc71e06dc8040d35ba808f63e318c711670ab87d20d9efed025017bdbc75efe00b181de9f2"

RPROVIDES:${PN} += "openmpi1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-1-10-7-gnu-hpc"

inherit rpm
