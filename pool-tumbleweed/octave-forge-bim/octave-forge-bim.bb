SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.6"

RPM_NAME = "octave-forge-bim-1.1.6-1.3.noarch.rpm"
RPM_HASH = "594b4945da8a94fd083918f83d30c7e55b2bd8e4bfbf335b244338c8f46c2f970a1bdc32cb6a41c4c5e36e6f3771580f8d1843ca2a92801d3f044ddbe131b2b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-bim"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-fpl \
octave-forge-msh"

inherit rpm
