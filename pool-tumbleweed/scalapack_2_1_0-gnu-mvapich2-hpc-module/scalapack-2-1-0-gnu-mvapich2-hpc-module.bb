SUMMARY = "Module files for scalapack_2_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mvapich2-hpc-module-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "9bf23d650eaf20cf6d8b5846ff04febe22124ff5c2b6a282ce8ad74c04d18ada62c610c01815632fe8f47469b6c69cb069a267dcfa42ca360ad2e1cde0ab2363"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-mvapich2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
