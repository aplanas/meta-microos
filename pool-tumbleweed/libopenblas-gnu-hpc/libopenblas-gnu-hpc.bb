SUMMARY = "Dependency package for libopenblas_0_3_21-gnu-hpc"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-gnu-hpc provides the dependency to get binary package libopenblas_0_3_21-gnu-hpc. \
When this package gets updated it installs the latest version of openblas_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-gnu-hpc-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "566cd0e1c05885791f1f28e28207868f6abf6cc48888445d47226fe7ea161b7af8ab1859a4e3961c27ee9c285949ad31a33aba3415563d3eeb54fcbe8e537ff9"

RPROVIDES:${PN} += "libopenblas-gnu-hpc"

RDEPENDS:${PN} += "/bin/sh \
libopenblas-0-3-21-gnu-hpc"

inherit rpm
