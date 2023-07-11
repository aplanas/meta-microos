SUMMARY = "Dependency package for mpich-ofi_4_0_2-gnu-hpc-devel"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel provides the dependency to get binary package mpich-ofi_4_0_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of mpich-ofi_4_0_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-4.0.2-3.4.aarch64.rpm"
RPM_HASH = "98c5434230ebe628f1ff912ec9132efa6f2df704814a9a7c513896508e99012c2cf3d856cbd0a05aee9c5dee710cc5750c1bb9527cc151a0b6f7106e367d250b"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel"

RDEPENDS:${PN} += "mpich-ofi-4-0-2-gnu-hpc-devel"

inherit rpm
