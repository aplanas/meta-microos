SUMMARY = "Static libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi1-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "3c0e1b827182564d15109d19ffb1d454472087f5132eaf66e17c3a37807bb8ac89f98b80ac6f320f770e7465b2982595bdc6f57fa55453d900822ea487b72798"

RPROVIDES:${PN} += "libscalapack2-openmpi1-devel-static \
scalapack-openmpi1-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi1-devel"

inherit rpm
