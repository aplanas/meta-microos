SUMMARY = "Development package for  kokkos packages"
DESCRIPTION = " \
Kokkos Core implements a programming model in C++ for writing performance \
portable applications targeting all major HPC platforms. For that purpose \
it provides abstractions for both parallel execution of code and data \
management.  Kokkos is designed to target complex node architectures with \
N-level memory hierarchies and multiple types of execution resources. It \
currently can use OpenMP, Pthreads and CUDA as backend programming models. \
 \
This package contains the development files of kokkos."
LICENSE = "BSD-3-Clause"

PV = "4.1.00"

RPM_NAME = "kokkos-devel-4.1.00-1.1.aarch64.rpm"
RPM_HASH = "990da7921a67ed9e5fc1da81a9bbc843619f83c1b01bc525d59488d40584146e3151f0cb82c42389326a04500b84cd9c9044ebe5426210a000df1fe22967990f"

RPROVIDES:${PN} += "cmake-Kokkos \
kokkos-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
hwloc-devel \
libkokkos-4-1"

inherit rpm
