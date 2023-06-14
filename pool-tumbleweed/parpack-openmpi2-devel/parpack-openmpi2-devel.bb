SUMMARY = "Development files for parpack-openmpi2"
DESCRIPTION = "The parpack-openmpi2-devel package contains libraries and header files for \
developing applications that use parpack-openmpi2."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi2-devel-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "c3eb7242bb062c16b638ce75d20f8f6367ac81ca6044223c71f8438c55c403ddd0620b3267a7fbb19e4038774ae164b913d3e2bf4c09062c449d3ac154d2f086"

RPROVIDES:${PN} += "parpack-openmpi2-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi2 \
openmpi2-devel"

inherit rpm
