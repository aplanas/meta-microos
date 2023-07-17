SUMMARY = "A C++ Performance Portability Programming Library"
DESCRIPTION = " \
Kokkos Core implements a programming model in C++ for writing performance \
portable applications targeting all major HPC platforms. For that purpose \
it provides abstractions for both parallel execution of code and data \
management.  Kokkos is designed to target complex node architectures with \
N-level memory hierarchies and multiple types of execution resources. It \
currently can use OpenMP, Pthreads and CUDA as backend programming models. \
 \
This package contains the kokkos library."
LICENSE = "BSD-3-Clause"

PV = "4.1.00"

RPM_NAME = "libkokkos-4_1-4.1.00-1.1.aarch64.rpm"
RPM_HASH = "09930da15eabb3b75706fa75e8015a42092d2a587aaf336df201af688af047b75e9a9157fcf4d32d8fae62871947b8d9cb1daff577afd3e656418d62980c82a7"

RPROVIDES:${PN} += "libkokkos-4-1 \
libkokkoscontainers.so.4.1 \
libkokkoscore.so.4.1 \
libkokkossimd.so.4.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
