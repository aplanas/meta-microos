SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the bash completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230722"

RPM_NAME = "gnu_parallel-bash-completion-20230722-1.1.noarch.rpm"
RPM_HASH = "7d65dcac1246751307669a0397e025363857cbead5cd05585f99145b11f5e30ae86d8931820f88c8b976e2f638f6558eff0373cabee84698a8bc4c37b98be0d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-bash-completion"

RDEPENDS:${PN} += "gnu-parallel"

inherit rpm
