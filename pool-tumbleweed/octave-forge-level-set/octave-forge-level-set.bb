SUMMARY = "Level-Set functions for Octave"
DESCRIPTION = "Routines for calculating the time-evolution of the level-set equation \
and extracting geometric information from the level-set function. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.1"

RPM_NAME = "octave-forge-level-set-0.3.1-1.9.noarch.rpm"
RPM_HASH = "55c4f22140e44e71d70b47b1a5888361f2dbc2fce24ba25c20df9aa0140a9a1924cf8a6f4705e8059017e8b883f1008d4f3fdefdca3a7bb1eb64151784be7fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-level-set"
RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-parallel"

inherit rpm
