SUMMARY = "Development libraries for OpenBLAS, pthreads version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_pthreads-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "7500cc59202e7bb704d5916ef6aa2d9888d578b82cb4ed21caba16774e88e9b46342c2ddd19da3da4ee8660d75b6b96d44173b5f28c24bcd95d3666d4d469b6d"

RPROVIDES:${PN} += "libopenblas-pthreads-devel \
openblas-devel-other"

RDEPENDS:${PN} += "libopenblas-pthreads0 \
openblas-common-devel"

inherit rpm
