SUMMARY = "Static version of OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the static libraries."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas-pthreads_0_3_21-gnu-hpc-devel-static-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "3e24eb1f2c7515a8fafb842c8d73ed7da0d94eed4116b8474cfac985baa46d9653deefd31243e6aeded4ce02b823eae22affc762bd39d31c12989862f05e5c26"

RPROVIDES:${PN} += "openblas-pthreads-0-3-21-gnu-hpc-devel-static"

RDEPENDS:${PN} += "libopenblas-pthreads-0-3-21-gnu-hpc-devel"

inherit rpm
