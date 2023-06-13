SUMMARY = "Dependency package for libopenblas-pthreads_0_3_21-gnu-hpc"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-pthreads-gnu-hpc provides the dependency to get binary package libopenblas-pthreads_0_3_21-gnu-hpc. \
When this package gets updated it installs the latest version of openblas-pthreads_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads-gnu-hpc-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "2ef8a75eacc93cce7769685b38e7067bc141e2065b3ead595518ce4ed726475f72b228faccbd3ff27e88ff7b95f60a91b42d8f00973ba6731fc1be6fc4840026"

RPROVIDES:${PN} += "libopenblas-pthreads-gnu-hpc \
libopenblas-pthreads-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libopenblas-pthreads_0_3_21-gnu-hpc"

inherit rpm
