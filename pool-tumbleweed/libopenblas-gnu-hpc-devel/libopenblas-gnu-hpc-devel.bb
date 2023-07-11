SUMMARY = "Dependency package for libopenblas_0_3_21-gnu-hpc-devel"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-gnu-hpc-devel provides the dependency to get binary package libopenblas_0_3_21-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openblas_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-gnu-hpc-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "f6446a3cc5c3bef18575b00c688cae2ed77ca937c9013b7feaad777df5ab27ac48c4ca9d2838ac4fb67494dca89ae41b8a1342efd950188b196c9c6f70291ea0"

RPROVIDES:${PN} += "libopenblas-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libopenblas-0-3-21-gnu-hpc-devel"

inherit rpm
