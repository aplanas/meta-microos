SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.6"

RPM_NAME = "octave-forge-bim-1.1.6-1.2.noarch.rpm"
RPM_HASH = "c62751f547c949f7535635f6a3737cd449fd78357c28d1b90a2cafd73885ce27b8a40e4d32629eb709448d85197469f46b2485eddd4779e1dc307914591932ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-bim"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-fpl \
octave-forge-msh"

inherit rpm
