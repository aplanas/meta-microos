SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_0_3_21-gnu-hpc-devel-static-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "6cb43a12874c3237ff841b617e68b9c1a86dad51b7fcd29476f2080ba0f5b628d455f2c2bec65b3937a511464b1bdfe3dba7e83ee4b24340afe8e8f902871a3f"

RPROVIDES:${PN} += "openblas_0_3_21-gnu-hpc-devel-static \
openblas_0_3_21-gnu-hpc-devel-static(aarch-64)"

RDEPENDS:${PN} += "libopenblas_0_3_21-gnu-hpc-devel"

inherit rpm
