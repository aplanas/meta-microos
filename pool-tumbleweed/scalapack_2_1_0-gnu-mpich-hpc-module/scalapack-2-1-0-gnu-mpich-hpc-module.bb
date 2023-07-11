SUMMARY = "Module files for scalapack_2_1_0-gnu-mpich-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against mpich."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-mpich-hpc-module-2.1.0-9.21.aarch64.rpm"
RPM_HASH = "67bd0787d39fbf4ae7623d643880302e000997e42b92423691c68d6bfdaa094229bee63041e0292e3183727bad65877d7eb6cc60f24d44b37e22eb6c3678d3ee"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-mpich-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
