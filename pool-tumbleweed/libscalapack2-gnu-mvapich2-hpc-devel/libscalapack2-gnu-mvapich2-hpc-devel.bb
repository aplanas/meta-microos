SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mvapich2-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mvapich2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mvapich2-hpc-devel-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "631fb7d5d46c6603e041288b58982868551f4d3b673ed86621944c9584313a5771c3c3b00176b9b5c3fb6c06c48cd4c473c7dd24e2b7ebbd35723e65019e7812"

RPROVIDES:${PN} += "libscalapack2-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-mvapich2-hpc-devel"

inherit rpm
