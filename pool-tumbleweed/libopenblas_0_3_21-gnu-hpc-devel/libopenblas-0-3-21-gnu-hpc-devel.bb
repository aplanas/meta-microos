SUMMARY = "Development libraries for OpenBLAS, gnu-hpc version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_0_3_21-gnu-hpc-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "5db7a7d789fdde221c87ac84a5dc4946cd67260caef3e1548d9ebb64ec090c3179f0124a8314dc0e839a2e0747c338201794da755dd86371c4f1e593248de5ea"

RPROVIDES:${PN} += "libopenblas-0-3-21-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libgomp.so.1 \
libm.so.6 \
libopenblas-0-3-21-gnu-hpc"

inherit rpm
