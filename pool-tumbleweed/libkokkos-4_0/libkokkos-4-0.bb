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

RPM_NAME = "libkokkos-4_0-4.0.01-1.1.aarch64.rpm"
RPM_HASH = "f174d3dfa7fa813ea7d311854e13699383e740870175b989d711a441949a734c9262b86076b24204f8fa24a720c5dd1b08c4c70801b012fc1d534e81134045f8"

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
