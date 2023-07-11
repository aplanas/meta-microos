SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_openmp-devel-static-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "395d466c0d5a58e54dd16e807dbff8a1d82a7131149a7a740450a96ebfa13fc5e15d995d91eaba98fa3e94a532bd1a0b70b2822fc82b3c88cdc2bdab4047a6dd"

RPROVIDES:${PN} += "openblas-openmp-devel-static"

RDEPENDS:${PN} += "libopenblas-openmp-devel"

inherit rpm
