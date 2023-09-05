SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mpich-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mpich-hpc-2.20.0-1.25.aarch64.rpm"
RPM_HASH = "52a6ed64d227dc94c2c4809b45afd733ce293e2cf0e0f3f803ea044a501001fd4c793900ef35948a8904b8b680cc6872302bad91c1b9fe172abc8ceee67afd93"

RPROVIDES:${PN} += "libHYPRE-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libHYPRE-2-20-0-gnu-mpich-hpc"

inherit rpm
