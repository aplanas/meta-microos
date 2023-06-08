SUMMARY = "ZSH Completion for catimg"
DESCRIPTION = "The official zsh completion script for catimg."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "catimg-zsh-completion-2.7.0-1.6.noarch.rpm"
RPM_HASH = "4e309bfebb6f8611b0423ec3b3406b0b9117a69a8110d4ea9e23b961210e230e894f3e1fc81ace9f15950faf8e14ce2dc45500664f21a414ed03ab50e7b7fc18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catimg-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
