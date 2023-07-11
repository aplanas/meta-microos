SUMMARY = "Development files for parpack-openmpi4"
DESCRIPTION = "The parpack-openmpi4-devel package contains libraries and header files for \
developing applications that use parpack-openmpi4."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi4-devel-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "9df6909036c34775026818871cae1420c4f0cdaa3eeb909e3ac2d393626a5c10626bbc655b44bfb94e6f3674a84f3b70ed4dfa45824765189d44dfccf5302bf4"

RPROVIDES:${PN} += "parpack-openmpi4-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi4 \
openmpi4-devel"

inherit rpm
