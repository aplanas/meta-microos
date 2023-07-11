SUMMARY = "Development files for parpack-openmpi3"
DESCRIPTION = "The parpack-openmpi3-devel package contains libraries and header files for \
developing applications that use parpack-openmpi3."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "parpack-openmpi3-devel-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "f0e02fe66c19c0e3114b3adbe22ebb83d6c56d9c6ac7612b94a46a687de0a2d90108ed13d57f1fd730a441dcdd2a0f0541cc2259c4bce8c18187a5084e171286"

RPROVIDES:${PN} += "parpack-openmpi3-devel"

RDEPENDS:${PN} += "blas-devel \
gcc-fortran \
lapack-devel \
libparpack2-openmpi3 \
openmpi3-devel"

inherit rpm
