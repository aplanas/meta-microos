SUMMARY = "Static libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "7181f8a18a0692bc62ed24f98f161aded880bd14f16f42f762d483465b428b26db80ffd041274c98998f6c935f0d211fe8c69d0d6b28e39d6619a6c9e6830455"

RPROVIDES:${PN} += "libscalapack2-openmpi4-devel-static \
libscalapack2-openmpi4-devel-static(aarch-64) \
scalapack-openmpi4-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi4-devel"

inherit rpm
