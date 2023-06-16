SUMMARY = "Module files for scalapack_2_1_0-gnu-mvapich2-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mvapich2-hpc-module-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "092bcaecf5514baeb8699400ca0caa34edf8b8baa51734576f7858495e05b952f8ac248f4ec9c19e797faffc7978f0a9077525655792055d170d47981a0cb0f3"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-mvapich2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
