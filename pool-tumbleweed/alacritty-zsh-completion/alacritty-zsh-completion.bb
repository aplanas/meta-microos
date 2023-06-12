SUMMARY = "ZSH Completion for alacritty"
DESCRIPTION = "The official zsh completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "alacritty-zsh-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "85cf03870268e7069e4a44b3339d0e5f09d55855b429fc280bedda7e8617f04ba62cacfbc463310f2e8b952c6651c63ea8d6fb9bf1fd68a0b5046b6b3d15fd05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
