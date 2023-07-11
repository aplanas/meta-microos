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

PV = "4.0.01"

RPM_NAME = "libkokkos-4_0-4.0.01-1.2.aarch64.rpm"
RPM_HASH = "b20de9a52ad4e2e6b669414d92bb5abc16d9f8e5796bc01d16519e568a9a5a9e17c428b09653688585e6545ca74b32f1d5e1e0229d3ba95b000ac1156956e339"

RPROVIDES:${PN} += "libkokkos-4-0 \
libkokkoscontainers.so.4.0 \
libkokkoscore.so.4.0 \
libkokkossimd.so.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhwloc.so.15 \
libstdc++.so.6"

inherit rpm
