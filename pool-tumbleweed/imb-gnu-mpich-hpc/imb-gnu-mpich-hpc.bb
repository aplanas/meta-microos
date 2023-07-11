SUMMARY = "Dependency package for imb_2021_3-gnu-mpich-hpc"
DESCRIPTION = "imb: Intel MPI Benchmarks (IMB) \
The package imb-gnu-mpich-hpc provides the dependency to get binary package imb_2021_3-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of imb_2021_3-gnu-mpich-hpc."
LICENSE = "BSD-3-Clause"

PV = "2021.3"

RPM_NAME = "imb-gnu-mpich-hpc-2021.3-1.3.noarch.rpm"
RPM_HASH = "d40287bb1cf8c4226288f00d1157363f43e8dd6ca23f047f44aa97a5762883376b644505b44e81a99dd810068cba118775bf41dc3029b3b22d3d5bcae3653ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imb-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
imb-2021-3-gnu-mpich-hpc"

inherit rpm
