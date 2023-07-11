SUMMARY = "Static libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi1-hpc-devel-static-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "7948cb8011c7bb99c34a555334b716ae9d1baa23cdecdc8f9db79bc382cbcbff1902feffc62b39175c66f412516a8818d9f06613c1bc3dd50ce73c66311c0e2b"

RPROVIDES:${PN} += "libscalapack2-2-1-0-gnu-openmpi1-hpc-devel-static \
scalapack-2-1-0-gnu-openmpi1-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2-2-1-0-gnu-openmpi1-hpc-devel"

inherit rpm
