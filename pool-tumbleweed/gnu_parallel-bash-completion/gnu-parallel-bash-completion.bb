SUMMARY = "zsh completion for GNU parallel"
DESCRIPTION = "GNU Parallel is a shell tool for executing jobs in parallel using one \
or more computers. \
This subpackage contains the bash completion for Parallel."
LICENSE = "GPL-3.0-or-later"

PV = "20230822"

RPM_NAME = "gnu_parallel-bash-completion-20230822-1.1.noarch.rpm"
RPM_HASH = "e3d4ece52eba15abfe81c90021e4bd6668b8fb5d1119304033a55ce747ed33e457809eda5abe10930bfc766b9cff299d663f712b5c8eb09c79c855cd11b5595f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-parallel-bash-completion"

RDEPENDS:${PN} += "gnu-parallel"

inherit rpm
