SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "073c41a09e9f0b4368de885dd02d116d38aeb12f1669120f97815721d363f10c41f1bb15108a322a1359bf61e38a09c0b3f7294a9b606c4df917c2354b546f0a"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
mpich-ofi-4-0-2-gnu-hpc"

inherit rpm
