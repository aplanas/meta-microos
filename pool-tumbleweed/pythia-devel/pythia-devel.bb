SUMMARY = "Development package for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the header and source files for development with \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.310"

RPM_NAME = "pythia-devel-8.310-1.1.aarch64.rpm"
RPM_HASH = "6fc131e2dd1e094d57975852ad20658476b4243856a87a376d260ab09535e98a73c60f5ef6b7d7184d1afea17ece7cffbcad30bc8a7bcc44cfc0512b4942c0cd"

RPROVIDES:${PN} += "config-pythia-devel \
pythia-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libpythia8 \
libpythia8lhapdf6"

inherit rpm
