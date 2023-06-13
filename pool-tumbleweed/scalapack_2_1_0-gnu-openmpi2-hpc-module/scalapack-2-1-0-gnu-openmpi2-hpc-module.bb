SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi2-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi2-hpc-module-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "9997767f43e0d2f296a7abbe32bd9ebf9262123780783e700b30522cee08b4366fa79e476e388f71473211c9be925bdfd4f3562ecba32ae8bdf420beab20e009"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-openmpi2-hpc-module \
scalapack_2_1_0-gnu-openmpi2-hpc-module(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
