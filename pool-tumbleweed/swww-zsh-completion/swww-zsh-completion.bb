SUMMARY = "Zsh Completion for swww"
DESCRIPTION = "Zsh command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.7.3"

RPM_NAME = "swww-zsh-completion-0.7.3-1.1.noarch.rpm"
RPM_HASH = "9305b351ff5302f894afa0a84144b11a255fa4f0e60588780132be2805c52feda42600dcff8be035ce5b3bcc76dfcfff11477353a9456a2c84eab84b18de63f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
