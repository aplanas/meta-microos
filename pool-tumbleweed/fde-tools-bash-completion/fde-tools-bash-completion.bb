SUMMARY = "Bash completion for fde-tools"
DESCRIPTION = "Bash shell completions for fde-tools"
LICENSE = "GPL-2.0-only"

PV = "0.6.6"

RPM_NAME = "fde-tools-bash-completion-0.6.6-2.1.noarch.rpm"
RPM_HASH = "5c7d67839ec5173e9ed5c57f55cd6cf00e7ee11708f00706b27120a6e84a36fc5064115425b5d633bc635a7a5edc477f8c8e0ed601a24f423e60d6d048603ed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fde-tools-bash-completion"

RDEPENDS:${PN} += "bash-completion \
fde-tools"

inherit rpm
