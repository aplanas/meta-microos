SUMMARY = "Zsh Completion for salt"
DESCRIPTION = "Zsh command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-zsh-completion-3006.0-4.1.noarch.rpm"
RPM_HASH = "f0db866081d34710cc27613dbae0a9de68548198ed71a2ef8d91ebd5111dc7fd125bde0dfee54c09098d3810d3b2cbf18e68285697a7b5d46d8855f222a2248a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-zsh-completion \
salt-zsh-completion"

RDEPENDS:${PN} += "salt \
zsh"

inherit rpm
