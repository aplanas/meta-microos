SUMMARY = "ZSH Completion for yadm"
DESCRIPTION = "The official zsh completion script for yadm."
LICENSE = "GPL-3.0-only"

PV = "3.2.2"

RPM_NAME = "yadm-zsh-completion-3.2.2-1.1.noarch.rpm"
RPM_HASH = "db7be9c454cdd60821d9b843e1b1e21cdf7bec1c7c9cb65ed1dbf8642318f99fc09449256b39a737ab1c3d8717e91997c6cab3bdb0d49044dee07e1e6226c2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yadm-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
