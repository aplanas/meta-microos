SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi1-hpc-devel-3.5-3.4.aarch64.rpm"
RPM_HASH = "bd794a2716268471c417a54f8e3dc575d4da818b4141332682cdbb5e065aef9532730e4ddc91a312268575961a4b6e369ddb5d60418220741735d2735181c510"

RPROVIDES:${PN} += "mpiP-3-5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
