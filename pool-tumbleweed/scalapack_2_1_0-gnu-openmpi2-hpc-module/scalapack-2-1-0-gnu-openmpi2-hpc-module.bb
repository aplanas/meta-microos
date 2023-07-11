SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi2-hpc-module-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "8c5be420c585fdc46a38d086ef874d5d47fbf0fb13d2d5ae55c083aa288c6930dcc8bfb1d7a52e52200e78f10c3f276b6b1ebc66b6de9df401b62d61c7ee80c5"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi2-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
