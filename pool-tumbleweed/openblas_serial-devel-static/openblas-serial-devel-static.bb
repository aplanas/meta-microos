SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_serial-devel-static-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "2f722b4e274c92449cf3bab32c673c950b88ba3574da9410aedf8d79c2787c153c9824831b4a4ff7f02875938199153909761c6f8a8093af975d1328b6a3e9ca"

RPROVIDES:${PN} += "openblas_serial-devel-static \
openblas_serial-devel-static(aarch-64)"

RDEPENDS:${PN} += "libopenblas_serial-devel"

inherit rpm
