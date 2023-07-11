SUMMARY = "Dependency package for libopenblas-pthreads_0_3_21-gnu-hpc-devel"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-pthreads-gnu-hpc-devel provides the dependency to get binary package libopenblas-pthreads_0_3_21-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openblas-pthreads_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads-gnu-hpc-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "6b04eb8e83433a0d5790eb13575ae0f868ff888fef9032a3667e131b8ea69b5536577e821144fd5ecf79c7dc4aecb1649b12e5f42f437c1769c846f962dd1460"

RPROVIDES:${PN} += "libopenblas-pthreads-gnu-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libopenblas-pthreads-0-3-21-gnu-hpc-devel"

inherit rpm
