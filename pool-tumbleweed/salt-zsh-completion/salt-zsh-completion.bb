SUMMARY = "Zsh Completion for salt"
DESCRIPTION = "Zsh command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-zsh-completion-3006.0-2.1.noarch.rpm"
RPM_HASH = "881b62acef67681e7cef4d358a31d7960ee732a8edfd4776281713d8b49516315f7279a14217774937fd317e5a05d0cd8c2d900dad41bfe8e3c16dc1c335b8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-salt-zsh-completion \
salt-zsh-completion"

RDEPENDS:${PN} += "salt \
zsh"

inherit rpm
