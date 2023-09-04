SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the zsh completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230822"

RPM_NAME = "gnu_parallel-zsh-completion-20230822-1.1.noarch.rpm"
RPM_HASH = "1d6d3bcf1ca97516103cffffe1c6cb0b51fbae2ee1daabdd8d4a32502b3f3ec555b5f5a5dcde40fd689e70253ccbdbabc5e685d3fcbc16110ff4b077c7d61054"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-zsh-completion"

RDEPENDS:${PN} += "gnu-parallel"

inherit rpm
