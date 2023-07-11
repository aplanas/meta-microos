SUMMARY = "Zsh Completion for firewalld"
DESCRIPTION = "Zsh command line completion support for firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-zsh-completion-2.0.0-1.1.noarch.rpm"
RPM_HASH = "3b7282880f5b6bd131aec08f2750337c912753f4eb1e877dd9734dc11fdae17a12cfcca9bb6b5cc179978dffb965fdcb58b344a7b4e01f9a902a7c43b9ecab88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-zsh-completion"

RDEPENDS:${PN} += "firewalld \
zsh"

inherit rpm
