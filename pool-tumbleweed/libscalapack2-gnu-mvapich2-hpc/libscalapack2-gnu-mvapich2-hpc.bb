SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mvapich2-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mvapich2-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mvapich2-hpc-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "43b2c8bf21d6cb475773ebb7aa842c3cdd03a646337c290dcb7a15fc29327fed5cc77b00693d95654de4a313d0ededeaeb90ba09f1c80a72a18d5225d9b5e91d"

RPROVIDES:${PN} += "libscalapack2-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-mvapich2-hpc"

inherit rpm
