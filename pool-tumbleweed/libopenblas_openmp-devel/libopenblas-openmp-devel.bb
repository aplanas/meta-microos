SUMMARY = "Development libraries for OpenBLAS, openmp version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_openmp-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "d1bb44f2142d9732bb8c9d74ef373401d3afc52b4e44b4250389eee121340bb3b6e5372d667506c91e3da6533a7265e0a63b88128f08955a5314f9a03d23408e"

RPROVIDES:${PN} += "libopenblas-openmp-devel \
openblas-devel \
openblas-devel-default"

RDEPENDS:${PN} += "libopenblas-openmp0 \
openblas-common-devel"

inherit rpm
