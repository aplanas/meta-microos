SUMMARY = "Octave Symbolic Package using SymPy"
DESCRIPTION = "Adds symbolic calculation features to GNU Octave. \
These include common Computer Algebra System tools such as algebraic \
operations, calculus, equation solving, Fourier and Laplace transforms, \
variable precision arithmetic and and other features. Compatibility \
with other symbolic toolboxes is a goal. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.1"

RPM_NAME = "octave-forge-symbolic-3.0.1-1.2.noarch.rpm"
RPM_HASH = "5046a35fe42c64da9fef1ea1bf5a39847d6d813cc7e4ecf5b0a741bb5d59c638e4df96fc7ef65757436ed4e7a4a8e02f62c02a557e59a706479d8ba69e8ad3c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-symbolic"
RDEPENDS:${PN} += "/bin/sh \
octave-cli \
python3-sympy"

inherit rpm
