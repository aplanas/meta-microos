SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mpich-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mpich-hpc-2.20.0-1.24.aarch64.rpm"
RPM_HASH = "e753cebf9dce4ed8f8ca702ccb404405fab23e633bef4f95171cd5b3af1bac9f4d553faf12c49b81b55e08cd247bc075609a6e8702875036ffd4853be1fea775"

RPROVIDES:${PN} += "libHYPRE-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-mpich-hpc"

inherit rpm
