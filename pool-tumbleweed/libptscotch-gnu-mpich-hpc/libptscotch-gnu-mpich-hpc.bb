SUMMARY = "Dependency package for libptscotch_6_1_0-gnu-mpich-hpc"
DESCRIPTION = "ptscotch: Graph, mesh and hypergraph partitioning library \
The package libptscotch-gnu-mpich-hpc provides the dependency to get binary package libptscotch_6_1_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of ptscotch_6_1_0-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch-gnu-mpich-hpc-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "ff2e58fda4ba3d651863fc399d52909e18e13365a12b85d65b0dcb9bb2a15f2fd0fa3d8517e3c767c4d2b99f154d9630990aa7097106f6437e18e8a72268d9dd"

RPROVIDES:${PN} += "libptscotch-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libptscotch-6-1-0-gnu-mpich-hpc"

inherit rpm
