SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas_serial-devel-static-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "5ca45dc6b2c465e0a002749a9b712fb2bfac64b97b5a4c0f60402b46d9d73154df839f60fdbd78af40c5f431c7d8e42e8609f88699b551f019e741310983dbfb"

RPROVIDES:${PN} += "openblas-serial-devel-static"

RDEPENDS:${PN} += "libopenblas-serial-devel"

inherit rpm
