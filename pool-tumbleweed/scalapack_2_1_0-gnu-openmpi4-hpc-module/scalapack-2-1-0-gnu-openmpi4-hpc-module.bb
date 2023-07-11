SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi4-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi4-hpc-module-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "a63babc300579809f22caa34dcea7f915a241fc82f70ff04461ae6d9272f3a9039faa3f8b05f678e214130b3f2495128637086fe1dbbf72568224824eb5f846c"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi4-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
