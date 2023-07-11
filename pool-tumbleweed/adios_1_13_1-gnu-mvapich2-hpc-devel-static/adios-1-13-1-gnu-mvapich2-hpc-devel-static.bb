SUMMARY = "Static libraries for adios_1_13_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-mvapich2-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mvapich2-hpc-devel-static-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "a7a4f0df4374fad99660b0eba508026da1276cc584aa5bb45903952f14b1dd2b12f3bcb2884c64331898878b1d18dd01f2e35c5683d19ad044285843fe6a0c33"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
