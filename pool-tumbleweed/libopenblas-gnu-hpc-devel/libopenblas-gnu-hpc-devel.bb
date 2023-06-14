SUMMARY = "Dependency package for libopenblas_0_3_21-gnu-hpc-devel"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-gnu-hpc-devel provides the dependency to get binary package libopenblas_0_3_21-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openblas_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-gnu-hpc-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "33086250cbd09cd18f8d9f6f4684c5c98152c1124cd35b0b6929d0da979494b3bbe68e166a0f7c333d43b16fe6fed71f8635fe5d6fafd53df2b114ff10e4d9fa"

RPROVIDES:${PN} += "libopenblas-gnu-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
libopenblas-0-3-21-gnu-hpc-devel"

inherit rpm
