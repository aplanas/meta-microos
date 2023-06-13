SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the zsh completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230422"

RPM_NAME = "gnu_parallel-zsh-completion-20230422-1.1.noarch.rpm"
RPM_HASH = "cec3a491c7af78cb0ab25b0f9be8f174f734b4d39f98e93909ccfca32aa21a8065598d28a9832767bb6880759b47fb36f3dfd6bf326bebfab3c8cf057061ddd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu_parallel-zsh-completion"

RDEPENDS:${PN} += "gnu_parallel"

inherit rpm
