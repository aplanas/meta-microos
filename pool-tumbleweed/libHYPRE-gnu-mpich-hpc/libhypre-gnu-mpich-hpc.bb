SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mpich-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mpich-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "f610e8f192cdbf8c09ae962273e8ea08eb2e3f2a561952eb674022b94d0292ecf1a513ca6bc82cdfc634474d7dbb24f65d617c5d4a3b658ae2573ac8058d80c2"

RPROVIDES:${PN} += "libHYPRE-gnu-mpich-hpc \
libHYPRE-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libHYPRE_2_20_0-gnu-mpich-hpc"

inherit rpm
