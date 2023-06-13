SUMMARY = "Bash completion for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains bash completion support for gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-bash-completion-2023-1.1.noarch.rpm"
RPM_HASH = "6d4fd0ca142b818be9a6fb3419396ad40f22c1ea37dfe516a6ec57a283c26c8886c51a4f1dd727c47ec518130d8bb9af325755e2186b2308f0233e8738191b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gromacs-bash \
gromacs-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
