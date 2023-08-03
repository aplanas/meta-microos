SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the zsh completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230722"

RPM_NAME = "gnu_parallel-zsh-completion-20230722-1.1.noarch.rpm"
RPM_HASH = "6852a18fc3ef7831fec63321c04213885bb6e7317952da2f634282a5b8527efac8a25ddbc73a7844e0a43a5480299f602c3da82446ba730708fa0182e0e6e67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-zsh-completion"

RDEPENDS:${PN} += "gnu-parallel"

inherit rpm
