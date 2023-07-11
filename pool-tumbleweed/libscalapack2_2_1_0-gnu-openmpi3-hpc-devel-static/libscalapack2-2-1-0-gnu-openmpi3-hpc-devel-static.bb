SUMMARY = "Static libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi3-hpc-devel-static-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "e310ab0d7c89ead78c6c68d795d33bdf3630eaf6a06551b424b75658e5dd6ba64a6166c79a98e7144a1b978507a35896dd02a8494d0501c0931021066c88e2fa"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-openmpi3-hpc-devel-static \
scalapack-2-1-0-gnu-openmpi3-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi3-hpc-devel"

inherit rpm
