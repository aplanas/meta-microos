SUMMARY = "Dependency package for openmpi_1_10_7-gnu-hpc"
DESCRIPTION = "openmpi: A powerful implementation of MPI \
The package openmpi1-gnu-hpc provides the dependency to get binary package openmpi_1_10_7-gnu-hpc. \
When this package gets updated it installs the latest version of openmpi_1_10_7-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-gnu-hpc-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "6d84fc18cfed40fe33e92adb8739bf97a2c00a424c0f5d906c356435b33f28bb9b0ae052ce1e37acdb7b95cba6bddcdfa21661d5ee3b2e77bcf2513ac5625bc5"

RPROVIDES:${PN} += "openmpi1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
openmpi-1-10-7-gnu-hpc"

inherit rpm
