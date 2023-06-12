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

RPM_NAME = "kokkos-devel-4.0.01-1.1.aarch64.rpm"
RPM_HASH = "e5c9ccc26d6df1841c9bcc0b1faa2b5b4558cd6bb5764cc27a9fb2650b5d834aa7653100f25823fd321568d3e47c3a8e12b61fd97a81c977ab31b3045fbdc77a"

RPROVIDES:${PN} += "cmake(Kokkos) \
kokkos-devel \
kokkos-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/bash \
hwloc-devel \
libkokkos-4_0"

inherit rpm
