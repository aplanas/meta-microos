SUMMARY = "Development libraries for OpenBLAS, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_openmp-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "31dcb5e4142cbe1acb563c1dbaeed44b66f7730246d3b7f53b2b38f86a6b7eaf3871aef14f510e5daa43d93a2e6e307b4a7ab8a230bff8de380767c41d03f858"

RPROVIDES:${PN} += "libopenblas-openmp-devel \
openblas-devel \
openblas-devel-default"

RDEPENDS:${PN} += "libopenblas-openmp0 \
openblas-common-devel"

inherit rpm
