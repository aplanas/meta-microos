SUMMARY = "Dependency package for openmpi_5_0_0-gnu-hpc"
DESCRIPTION = "openmpi: An implementation of MPI/SHMEM (Version 5) \
The package openmpi5-gnu-hpc provides the dependency to get binary package openmpi_5_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_5_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-gnu-hpc-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "f48195f9cbbe56a0537050cac5ebb5013329f6a65e7cb91d58c38dcdc5e9310386b3255c713c15f40dd4f6e9ce517af1b2f5907d2794e985b54c1859af167964"

RPROVIDES:${PN} += "openmpi5-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-5-0-0-gnu-hpc"

inherit rpm
