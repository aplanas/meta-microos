SUMMARY = "ZSH completion for konsole"
DESCRIPTION = "ZSH command line completion support for konsole."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "konsole-zsh-completion-23.08.0-2.1.noarch.rpm"
RPM_HASH = "822335979910197f17acaf0909488409cd18a21221f91162db566fe10787ce3a752158fc5014ef53e7883a74af7149dee94a9fa3bcecd47b20c205a50ddcba3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-zsh-completion"

RDEPENDS:${PN} += "konsole"

inherit rpm
