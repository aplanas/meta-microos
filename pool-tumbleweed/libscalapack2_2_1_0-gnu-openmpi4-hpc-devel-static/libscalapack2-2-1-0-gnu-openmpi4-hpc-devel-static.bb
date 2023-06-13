SUMMARY = "Static libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-static-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "330acadba6a89e9a0aa1f7beaee2962ffb213811fb3ae9fe2e1f9460a7d27fd925a0a944a34beb978a9258b04a0a97a65d70dbf2a4b1babc148e5c75aa20fd98"

RPROVIDES:${PN} += "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-static \
libscalapack2_2_1_0-gnu-openmpi4-hpc-devel-static(aarch-64) \
scalapack_2_1_0-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel"

inherit rpm
