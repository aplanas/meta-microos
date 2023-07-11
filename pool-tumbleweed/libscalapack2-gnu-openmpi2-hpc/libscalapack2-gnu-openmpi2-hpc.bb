SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi2-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi2-hpc-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "7ef2fa7ff2975ad15d87db30bd5bcfc0ecd7ef0547d9041c45b01c879ded5c83aa092341b015010ed6a02151ae6f3795700e5d0153d3fdb982c6567258cb737b"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-openmpi2-hpc"

inherit rpm
