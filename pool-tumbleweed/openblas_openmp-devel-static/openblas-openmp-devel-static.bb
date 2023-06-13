SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_openmp-devel-static-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "0feadbe2114a0ab355c23e7cbbdaf4cf20a02d7a1082bdb2d03d421863a1a222391ae4877488f37ddf29f56e7f46cbb4fde18cf03d14b3a66bf3764ed8e3440c"

RPROVIDES:${PN} += "openblas_openmp-devel-static \
openblas_openmp-devel-static(aarch-64)"

RDEPENDS:${PN} += "libopenblas_openmp-devel"

inherit rpm
