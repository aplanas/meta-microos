SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_pthreads-devel-static-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "9837c4fa9e498d430ea5f99577b9d4c6f8ac19f2348257dd6dece750ea3a89f49eb78903bdfd2b90c4f81a60e0e5a1255e7d6cbf42e4494a4548e9255d0006fa"

RPROVIDES:${PN} += "openblas_pthreads-devel-static \
openblas_pthreads-devel-static(aarch-64)"

RDEPENDS:${PN} += "libopenblas_pthreads-devel"

inherit rpm
