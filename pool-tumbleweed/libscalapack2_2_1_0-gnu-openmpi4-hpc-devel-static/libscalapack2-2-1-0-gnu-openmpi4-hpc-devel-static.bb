SUMMARY = "Static libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-static-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "df5bf758d33b68ace941466308b4894421daf301ead37e2c6dc5e14d21e098113d50c0f07f39843365a853fa37dd402b6a4c7cb841111e002a081736a5f8149a"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-openmpi4-hpc-devel-static \
scalapack-2-1-0-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi4-hpc-devel"

inherit rpm
