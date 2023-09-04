SUMMARY = "Zsh Completion for zellij"
DESCRIPTION = "Zsh command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-zsh-completion-0.37.2-2.1.noarch.rpm"
RPM_HASH = "770dcbe5d111db7ea9b6ab72db11728548f4c9fcaa0aaaa4af4b5560225488077bc45d3278580dbcee6d91f4959dc130a6140c8a58180d98ecb15db8aa52494d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
