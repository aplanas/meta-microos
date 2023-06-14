SUMMARY = "Development libraries for OpenBLAS, gnu-hpc-pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads_0_3_21-gnu-hpc-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "7c7cbe745c17c905820611c70e0ad7ccc6caf2dc157ad1348488b3b740f8ee12cc3e5079063301d0ce85d2803b6ae046784f79039b44cb3c3c60dc87f3763544"

RPROVIDES:${PN} += "libopenblas-pthreads-0-3-21-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-pthreads-0-3-21-gnu-hpc"

inherit rpm
