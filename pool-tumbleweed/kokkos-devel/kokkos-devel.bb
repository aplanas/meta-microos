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

PV = "4.0.01"

RPM_NAME = "kokkos-devel-4.0.01-1.2.aarch64.rpm"
RPM_HASH = "a5717b91a1f3a4ebcaa303edfbc306aacd198ed948f31af6b2195663b71aaa97201768c6cf75d5b19f58bcead0b3bf2565b7d94c7d23394e5e39da779ef72544"

RPROVIDES:${PN} += "cmake-Kokkos \
kokkos-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
hwloc-devel \
libkokkos-4-0"

inherit rpm
