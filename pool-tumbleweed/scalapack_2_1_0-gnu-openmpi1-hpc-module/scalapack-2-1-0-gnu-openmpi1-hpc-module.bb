SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi1-hpc-module-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "9f68adc69d4c80d65ca5b2a1054b530f2ee32bed4969d5a5570fcc1efef44a2e0f98602512823e26e2d88f8193d7b4984fdfcd1053f0d0fffb1016745b737ef0"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi1-hpc-module"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
