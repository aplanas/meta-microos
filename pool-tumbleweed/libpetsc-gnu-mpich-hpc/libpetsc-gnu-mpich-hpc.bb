SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-mpich-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-mpich-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-mpich-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-mpich-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "8580ead618a5bbf28a697a6ecf7819c2d88b9d2821126fc9af370c56ff76f859049c86fd026e366548eaaf205b5a9e0a60d42a04e5a45c4b3c929505e689c064"

RPROVIDES:${PN} += "libpetsc-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-mpich-hpc"

inherit rpm
