SUMMARY = "Dependency package for libopenblas-pthreads_0_3_21-gnu-hpc-devel"
DESCRIPTION = "openblas: An optimized BLAS library based on GotoBLAS2 \
The package libopenblas-pthreads-gnu-hpc-devel provides the dependency to get binary package libopenblas-pthreads_0_3_21-gnu-hpc-devel. \
When this package gets updated it installs the latest version of openblas-pthreads_0_3_21-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas-pthreads-gnu-hpc-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "83bfef3cbbfda1c650e33d562ebb646948ab9da9d298cf46550a89c3f3e6a7e0901faa393de8b02933aaa37c0bd30dd9833092a0779c7c3f98692468d1de309d"

RPROVIDES:${PN} += "libopenblas-pthreads-gnu-hpc-devel \
libopenblas-pthreads-gnu-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libopenblas-pthreads_0_3_21-gnu-hpc-devel"

inherit rpm
