SUMMARY = "Octave Symbolic Package using SymPy"
DESCRIPTION = "Adds symbolic calculation features to GNU Octave. \
These include common Computer Algebra System tools such as algebraic \
operations, calculus, equation solving, Fourier and Laplace transforms, \
variable precision arithmetic and and other features. Compatibility \
with other symbolic toolboxes is a goal. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.1"

RPM_NAME = "octave-forge-symbolic-3.0.1-1.3.noarch.rpm"
RPM_HASH = "d5755f5224cb5ec9be98d61b9e258cd836df13d77dacc45220953ec0a6a8805e5e30804a766da84d80add19a33441f0cad5abce448c64afdf8f4d61cc032dd60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-symbolic"

RDEPENDS:${PN} += "/usr/bin/sh \
octave-cli \
python3-sympy"

inherit rpm
