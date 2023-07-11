SUMMARY = "Dependency package for libopenblas-pthreads_0_3_21-gnu-hpc"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-pthreads-gnu-hpc provides the dependency to get binary package libopenblas-pthreads_0_3_21-gnu-hpc. \
When this package gets updated it installs the latest version of openblas-pthreads_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads-gnu-hpc-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "e23ab59477646310be22113a01391bc95ebc7aafaeb1ad71e3641d313232a20cc70d5e18169ac29d28780ce1a672d97d730caca3b20223081eb2440befbd51ae"

RPROVIDES:${PN} += "libopenblas-pthreads-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libopenblas-pthreads-0-3-21-gnu-hpc"

inherit rpm
