SUMMARY = "Dependency package for libopenblas_0_3_21-gnu-hpc"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-gnu-hpc provides the dependency to get binary package libopenblas_0_3_21-gnu-hpc. \
When this package gets updated it installs the latest version of openblas_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-gnu-hpc-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "76a949ff10a2363264f59320a4a1fcabd0a84407172cb3775f2cd27b2c5966e9498de7d6fa98316bb20830eb8946271a56c6be234e615e092004a5c4209a6afa"

RPROVIDES:${PN} += "libopenblas-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libopenblas-0-3-21-gnu-hpc"

inherit rpm
