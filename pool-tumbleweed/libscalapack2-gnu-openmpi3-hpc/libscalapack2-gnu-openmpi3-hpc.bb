SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi3-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi3-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi3-hpc-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "3e89a92894b16f875e941f04d7bfaaa665db810a4423ca77eaaf976ec498f10bd65fe828dfeddafafb67b5957808b32366a60fad94f93119a9758ea0ca8dcaaf"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-openmpi3-hpc"

inherit rpm
