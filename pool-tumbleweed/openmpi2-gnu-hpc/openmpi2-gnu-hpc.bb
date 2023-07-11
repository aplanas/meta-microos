SUMMARY = "Dependency package for openmpi_2_1_6-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM \
The package openmpi2-gnu-hpc provides the dependency to get binary package openmpi_2_1_6-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_2_1_6-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-gnu-hpc-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "7758ed5baa25047b2bf3bf0cb44c212a561c958cbdbfd8fed1034d505c02ee94d25dd799684f38ac76b8b8a7ba92bad2b0ed474f4ada6c0b0ea1652904a45281"

RPROVIDES:${PN} += "openmpi2-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-2-1-6-gnu-hpc"

inherit rpm
