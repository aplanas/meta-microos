SUMMARY = "ZSH completion for dolphin"
DESCRIPTION = "ZSH command line completion support for dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "dolphin-zsh-completion-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8015cd6be874f9e88c9a8b64a495368e5c66abbf6790ab517d1454ac0ffd1325360cd77a43da5bb0ac6daff5633191fa7dd8f7e9e68a5e5e451b9c75a96d7ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-zsh-completion"
RDEPENDS:${PN} += "dolphin"

inherit rpm
