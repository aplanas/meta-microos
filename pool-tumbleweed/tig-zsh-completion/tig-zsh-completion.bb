SUMMARY = "Zsh completion for tig"
DESCRIPTION = "Zsh command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-zsh-completion-2.5.8-1.2.noarch.rpm"
RPM_HASH = "843512989d92b3be5e37a9aab5b447c5b390de86ecc7b80831c03f7b18e5d45547417291c4ac744f8775f2580ba2ce5246980d05fc980a0f1afe9fb0805b5ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-zsh-completion"

RDEPENDS:${PN} += "tig \
zsh"

inherit rpm
