SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_0_3_21-gnu-hpc-devel-static-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "e1175a2f60f37da88e6d576dbcb484874b0c63b5a535b23abf98f8b64e44a3b66cb19f3704b91a5246b26e7105c29920ceb22f5fad37392a622d9c3b920050a2"

RPROVIDES:${PN} += "openblas-0-3-21-gnu-hpc-devel-static"

RDEPENDS:${PN} += "libopenblas-0-3-21-gnu-hpc-devel"

inherit rpm
