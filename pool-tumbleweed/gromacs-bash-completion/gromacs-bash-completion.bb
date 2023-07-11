SUMMARY = "Bash completion for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains bash completion support for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-bash-completion-2023-1.2.noarch.rpm"
RPM_HASH = "9bb59b3c6d42585919fdf421be77b0303b9d3a676d494637e1e89e72066b633fb37dd073e1c593c3fec78768c75e968879c4c58d97d4d8fe56196a0475bfa46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-bash \
gromacs-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
