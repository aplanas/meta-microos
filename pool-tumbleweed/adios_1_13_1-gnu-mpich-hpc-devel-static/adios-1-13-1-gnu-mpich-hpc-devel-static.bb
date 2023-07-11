SUMMARY = "Static libraries for adios_1_13_1-gnu-mpich-hpc"
DESCRIPTION = "The Adaptable IO System (ADIOS) provides a way for scientists to \
describe the data in their code that may need to be written, read, or \
processed outside of the running simulation. \
 \
This package contains all the static libraries needed to create projects \
that use the gnu-mpich-hpc version of ADIOS."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & BSD-2-Clause"

PV = "1.13.1"

RPM_NAME = "adios_1_13_1-gnu-mpich-hpc-devel-static-1.13.1-5.15.aarch64.rpm"
RPM_HASH = "bbf30773a20e251d6559531e355c648d24a957da5b2bd5f6bcc1636e399166f0c85ad6946cda1aecaa78bad7edf48c33a8c448f2e2a93e512c6f4323a354aeac"

RPROVIDES:${PN} += "adios-1-13-1-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
