SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.12"

RPM_NAME = "octave-forge-msh-1.0.12-1.3.noarch.rpm"
RPM_HASH = "9270b816da8841f0236abe59c3a3c82f206c485d7779b9d9e2ee8516efab8662d97d7e4b12b1042a4625b800f290b4473e673cb3ce9ffc012c31cdea9f257f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-msh"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
octave-forge-splines"

inherit rpm
