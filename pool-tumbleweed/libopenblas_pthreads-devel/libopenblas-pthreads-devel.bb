SUMMARY = "Development libraries for OpenBLAS, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_pthreads-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "896fffb47cc166163df485d4f87decadb5682d4128a814217b5accc59e45b19f60b3659e3b0d0c436190b8df14c60c53366173f64aedf0f18f9c73288c199012"

RPROVIDES:${PN} += "libopenblas-pthreads-devel \
openblas-devel-other"

RDEPENDS:${PN} += "libopenblas-pthreads0 \
openblas-common-devel"

inherit rpm
