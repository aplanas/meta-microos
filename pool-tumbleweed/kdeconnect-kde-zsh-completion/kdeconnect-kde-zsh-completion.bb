SUMMARY = "ZSH completion for kdeconnect-kde"
DESCRIPTION = "ZSH command line completion support for kdeconnect-kde."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdeconnect-kde-zsh-completion-23.04.3-1.1.noarch.rpm"
RPM_HASH = "482f52835fbadf95375caccdcee5927b1e2263f73df00ace39eeb40af16a08701d07cf4df7264a0a6d01651f7cf7ed2fef7525d3d5b748fcae1c40adffbe2dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-zsh-completion"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
