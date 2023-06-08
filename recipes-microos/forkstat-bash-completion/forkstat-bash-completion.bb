SUMMARY = "Bash Completion for forkstat"
DESCRIPTION = "Bash completion script for forkstat."
LICENSE = "GPL-2.0-or-later"

PV = "0.03.01"

RPM_NAME = "forkstat-bash-completion-0.03.01-1.2.noarch.rpm"
RPM_HASH = "f9d6ecdb2446bd47a1db306350aa54bc87098bd5fe8400c747dd09416f7d6a256ef6463101da8030ec632e5a681fa6969429635a0f865f5fa6fd79783152588e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forkstat-bash-completion"
RDEPENDS:${PN} += "bash-completion forkstat"

inherit rpm
