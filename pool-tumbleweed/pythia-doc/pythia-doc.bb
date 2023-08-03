SUMMARY = "Documentation for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides documentation for development with pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.310"

RPM_NAME = "pythia-doc-8.310-1.1.aarch64.rpm"
RPM_HASH = "9ab6421855d335995626f50d096e7f4d82ced79039ee8051682eff8c886456dd8e61c9619705a3ae8e83d28c66be34b3f2c354aaf65372886f0b09794374b50f"

RPROVIDES:${PN} += "pythia-doc"

RDEPENDS:${PN} += ""

inherit rpm
