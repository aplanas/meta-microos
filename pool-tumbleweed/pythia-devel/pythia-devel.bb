SUMMARY = "Development package for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the header and source files for development with \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "pythia-devel-8.307-1.15.aarch64.rpm"
RPM_HASH = "084ae8702aa5ca4904976aaae4dceef8522d22a3c88cdfa16fca6e25a18ba3f1d93a58b878a53e12e3103a62a493a4909f45c08f3fcca27c462e858c444cb47b"

RPROVIDES:${PN} += "config-pythia-devel \
pythia-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libpythia8 \
libpythia8lhapdf6"

inherit rpm
