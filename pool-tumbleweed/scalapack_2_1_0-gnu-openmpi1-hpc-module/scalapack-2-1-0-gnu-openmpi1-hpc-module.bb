SUMMARY = "Module files for scalapack_2_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "This package contains module files required by SCALAPACK and BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi1-hpc-module-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "576d001975db82189a34d4aaa2b052c3880212fd971128641c5207bb7c04a13b1d689daaa19131d4f5d3afb9a631b99b6bbbcb315f97715a2e572919b2ab3d79"

RPROVIDES:${PN} += "scalapack-2-1-0-gnu-openmpi1-hpc-module"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
