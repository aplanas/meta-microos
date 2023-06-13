SUMMARY = "PDE Solver using a Finite Element/Finite Volume approach"
DESCRIPTION = "Package for solving Diffusion Advection Reaction (DAR) Partial Differential Equations. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.12"

RPM_NAME = "octave-forge-msh-1.0.12-1.2.noarch.rpm"
RPM_HASH = "3e9aa0228989384a709dce49fc028259f6aa3b0cecbd49c4ec0edfe34317147d4a718c39678466c75532e9988277cf892d73fa9a6007961d214bd2ea1a7be9d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-msh"

RDEPENDS:${PN} += "/bin/sh \
octave-cli \
octave-forge-splines"

inherit rpm
