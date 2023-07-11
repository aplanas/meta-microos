SUMMARY = "Documentation for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides documentation for development with pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "pythia-doc-8.307-1.15.aarch64.rpm"
RPM_HASH = "d66015b20062a36ebd3a43152bad28ffd29c200ea98a37bd742ce24c16d4ed73b0d9e3c8dd84d2ccab84d29ea8d9e488076af86d493958d430717f86c4ef3776"

RPROVIDES:${PN} += "pythia-doc"

RDEPENDS:${PN} += ""

inherit rpm
