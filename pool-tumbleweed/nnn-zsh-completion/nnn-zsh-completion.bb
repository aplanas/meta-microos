SUMMARY = "ZSH Completion for nnn"
DESCRIPTION = "The official zsh completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-zsh-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "1455aee5f671e7dc2a64fc3ccec5e78ddc8f9c4e596c9d8388a29d76bae787310246005b2222736d8394f31399046daccf8e2a0ef1f0c3c607d50c1685130f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
