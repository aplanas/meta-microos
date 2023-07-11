SUMMARY = "Level-Set functions for Octave"
DESCRIPTION = "Routines for calculating the time-evolution of the level-set equation \
and extracting geometric information from the level-set function. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "octave-forge-level-set-0.3.1-1.10.noarch.rpm"
RPM_HASH = "42fcc7cec2cec6cbdf09a95bc7783fb01cf9187cb44470edaa9bf3f6315fa97d421e345a3b6739a1393f75b4024b10d0269771024d6149369cc737bf142755c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-level-set"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-parallel"

inherit rpm
