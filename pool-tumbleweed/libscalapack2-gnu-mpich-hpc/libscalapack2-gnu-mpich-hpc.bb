SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-mpich-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-mpich-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-mpich-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-mpich-hpc-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "00dd8490a93be1541efcfc7421eaf3b4f3cde44934c09569230ae1911fc452648f421de17d9f6e17aae2063507be437e109495fb674d5237623034745e37c2a7"

RPROVIDES:${PN} += "libscalapack2-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-mpich-hpc"

inherit rpm
