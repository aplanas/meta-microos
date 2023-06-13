SUMMARY = "The zsh completion for etckeeper"
DESCRIPTION = "zsh command line completion support for etckeeper."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.18"

RPM_NAME = "etckeeper-zsh-completion-1.18.18-2.2.noarch.rpm"
RPM_HASH = "2cae73195b4411e246e971c3f2cd15c8f321dcd9cb9de10c52bb162b3e57cfddd1ea2ee761bf9feb73f42c385c9463d34eb2f1d85788b4aeb001c3c9a6101e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-zsh-completion"

RDEPENDS:${PN} += "etckeeper"

inherit rpm
