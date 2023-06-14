SUMMARY = "Development files for parpack-openmpi3"
DESCRIPTION = "The parpack-openmpi3-devel package contains libraries and header files for \
developing applications that use parpack-openmpi3."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi3-devel-3.9.0-1.3.aarch64.rpm"
RPM_HASH = "0500e3f3ee1d66f154fe2b061e64f2be0fb0836f9969b59db3e9515e8f5de9894a335ab267462f4a00fcea4a15583f9ccd8c15ce6ce7706854736b4be7d3720e"

RPROVIDES:${PN} += "parpack-openmpi3-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi3 \
openmpi3-devel"

inherit rpm
