SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mpich-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mpich-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mpich-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mpich-hpc-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "88cee68084ad35a642a8328164af9c6d8895cbded75ee7c1e73416a27627bddd39087c001cd6638e49a06b3a927fa9f291f32a78a9b41cff8d8309d550633a8f"

RPROVIDES:${PN} += "libscalapack2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/bin/sh \
libscalapack2-2-1-0-gnu-mpich-hpc"

inherit rpm
