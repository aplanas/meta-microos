SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_pthreads-devel-static-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "fe3b7a91f4be8538a5717546d7ebcf18124149c8782edc583bea1fbc6d9fe09233be412efd6e7643e1ea8afb86bc87f8ee1e82fa4feabead65522da9b9259edf"

RPROVIDES:${PN} += "openblas-pthreads-devel-static"

RDEPENDS:${PN} += "libopenblas-pthreads-devel"

inherit rpm
