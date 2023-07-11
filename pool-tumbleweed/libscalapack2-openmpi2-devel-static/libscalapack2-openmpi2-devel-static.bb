SUMMARY = "Static libraries for ScaLAPACK (openmpi2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi2-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "04b3695ff5618a721d49f3f0a21fb6f2338a25dfb7648215f7a094f8d82dc225d6c116d6a670f2fe6ba93baf3a7be2c764e8c1e1ccdaddd1de02a6daf378356a"

RPROVIDES:${PN} += "libscalapack2-openmpi2-devel-static \
scalapack-openmpi2-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi2-devel"

inherit rpm
