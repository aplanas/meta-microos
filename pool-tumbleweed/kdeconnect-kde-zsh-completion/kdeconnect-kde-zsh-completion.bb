SUMMARY = "ZSH completion for kdeconnect-kde"
DESCRIPTION = "ZSH command line completion support for kdeconnect-kde."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdeconnect-kde-zsh-completion-23.04.3-2.1.noarch.rpm"
RPM_HASH = "5b563fbdb9eef26db64c4933b4d6e2dd5b126272559d62d90bf984c162c319f421295461d14120bf3ca01108c939a3eb6b42b660434f88083115eb765ae1cb5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-zsh-completion"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
