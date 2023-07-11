SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi3-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi3-hpc-module-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "9a494536d2574b6baa83d0d8deac4c3e041ca7e5cdd7f80092f55950d2db5eb5d724704d759fa356c079737e57519e5cbafeddc4547823678c4f086999079a9f"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi3-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
