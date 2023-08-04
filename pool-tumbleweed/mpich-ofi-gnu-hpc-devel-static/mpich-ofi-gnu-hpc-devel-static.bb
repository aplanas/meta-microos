SUMMARY = "Dependency package for mpich-ofi_4_1_2-gnu-hpc-devel-static"
DESCRIPTION = "mpich: High-performance and widely portable implementation of MPI \
The package mpich-ofi-gnu-hpc-devel-static provides the dependency to get binary package mpich-ofi_4_1_2-gnu-hpc-devel-static. \
When this package gets updated it installs the latest version of mpich-ofi_4_1_2-gnu-hpc."
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "mpich-ofi-gnu-hpc-devel-static-4.1.2-1.1.aarch64.rpm"
RPM_HASH = "c46bece5db72a5cf6a25d25e95b7b796788f26d0076ed522a80f6eeba5ca4f7f7670b06e7107e008d52589f08f666f8d2406b95ffb7600d208da05f6c5710578"

RPROVIDES:${PN} += "mpich-ofi-gnu-hpc-devel-static"

RDEPENDS:${PN} += "mpich-ofi-4-1-2-gnu-hpc-devel-static"

inherit rpm
