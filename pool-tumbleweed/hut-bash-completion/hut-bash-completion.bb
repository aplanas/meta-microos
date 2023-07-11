SUMMARY = "Bash Completion for hut"
DESCRIPTION = "The official bash completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-bash-completion-0.3.0-1.3.noarch.rpm"
RPM_HASH = "b83d2dc481954ee871ae05304ba3d4d3444433a99167490845cfc67cf75025e296f9d67838a9a54531475b4d54d691bbf6530697f01057b8f401b08c045f6f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
