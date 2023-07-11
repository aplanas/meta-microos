SUMMARY = "Static libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi3-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "539bcbef2b90e9e628836db91f355fde4be88daa8d6f4a6c7987847ae848858a1547b8c3733b58d5ee94c73ff38e209373e485cc5ce8376b71e3bb70bbe6872b"

RPROVIDES:${PN} += "libscalapack2-openmpi3-devel-static \
scalapack-openmpi3-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi3-devel"

inherit rpm
