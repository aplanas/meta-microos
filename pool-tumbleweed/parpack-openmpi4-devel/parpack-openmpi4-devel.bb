SUMMARY = "Development files for parpack-openmpi4"
DESCRIPTION = "The parpack-openmpi4-devel package contains libraries and header files for \
developing applications that use parpack-openmpi4."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi4-devel-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "af80a5a0c76f820a7266206058a4ff526834ea147bdeda13ab523e1d710ed52dc13ace3b3192f408daa074a05b99204fc0557ed01ea9fef5c2995308a73822d7"

RPROVIDES:${PN} += "parpack-openmpi4-devel \
parpack-openmpi4-devel(aarch-64)"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi4 \
openmpi4-devel"

inherit rpm
