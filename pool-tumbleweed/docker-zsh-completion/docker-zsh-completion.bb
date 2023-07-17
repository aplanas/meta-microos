SUMMARY = "Zsh Completion for docker"
DESCRIPTION = "Zsh command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.4_ce"

RPM_NAME = "docker-zsh-completion-24.0.4_ce-1.1.noarch.rpm"
RPM_HASH = "dcc35f321ae4ec6e26b6215f7a43699ca112b1da3bdd86a197a3fce7ac0843a96bb80ed22e00612e60085e3c9e068c8f670e432ce1bd87ae7ec366bda83634d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-zsh-completion"

RDEPENDS:${PN} += "docker \
zsh"

inherit rpm
