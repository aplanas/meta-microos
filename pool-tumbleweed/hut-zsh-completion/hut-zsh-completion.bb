SUMMARY = "ZSH Completion for hut"
DESCRIPTION = "The official zsh completion script for hut."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-zsh-completion-0.3.0-1.3.noarch.rpm"
RPM_HASH = "cf6af22f53454babb4ec564346f6fd20b93421e074b0c6f53ab9e844567b6eeb94ae2d69f2d267125bbac52935904da4ca5aa77191e6a5a11cee295c99e8a14d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hut-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
