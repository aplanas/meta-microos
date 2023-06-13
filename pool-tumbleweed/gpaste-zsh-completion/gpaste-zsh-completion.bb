SUMMARY = "Zsh tab-completion for gpaste"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
This package provides zsh tab-completion for gpaste."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "gpaste-zsh-completion-43.2+6-2.1.noarch.rpm"
RPM_HASH = "4213e50224db1a192f5f389c0c24147a2209e95ce64e1d658c6881d2a1b0e7ca28969c15e9ab4ffdb6e057a498f041504cb616a40d009cc61c17688cc3473e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpaste-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
