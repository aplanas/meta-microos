SUMMARY = "An optimized BLAS library based on GotoBLAS2, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_pthreads0-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "b948e7de9b6b7ebc5a1a7bc75a2bedbbfa8a7890a15481c45d107de10fc4bc46b85034f1b25991afa13652510e6e909072f5fc1274095f996336cce4ff646cdd"

RPROVIDES:${PN} += "libopenblas-pthreads0 \
libopenblas.so.0"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
update-alternatives"

inherit rpm
