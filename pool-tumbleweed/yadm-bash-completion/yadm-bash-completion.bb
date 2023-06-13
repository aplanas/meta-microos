SUMMARY = "Bash completions for yadm"
DESCRIPTION = "The official bash completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.2"

RPM_NAME = "yadm-bash-completion-3.2.2-1.1.noarch.rpm"
RPM_HASH = "d0b5478ccdf6cab05fd9b5aab7e202c730f9357ea1c60a8f20ce1a15e9959972cfae09c4bdb4fd142d3bb804970843c05093075ddccb4140c9bb13db5fa46cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
