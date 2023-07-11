SUMMARY = "ZSH completion for konsole"
DESCRIPTION = "ZSH command line completion support for konsole."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konsole-zsh-completion-23.04.3-1.1.noarch.rpm"
RPM_HASH = "1b32be13c1d05c9cc5984cc7a4a107445730de6b550150651d2a8b8d8d3cc06e9c90f5c9e54fb3d895896426326655931f1fb56d533ebfb9b4c8e77026b14c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-zsh-completion"

RDEPENDS:${PN} += "konsole"

inherit rpm
