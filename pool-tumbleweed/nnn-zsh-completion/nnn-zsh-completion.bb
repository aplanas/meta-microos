SUMMARY = "ZSH Completion for nnn"
DESCRIPTION = "The official zsh completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.9"

RPM_NAME = "nnn-zsh-completion-4.9-1.1.noarch.rpm"
RPM_HASH = "2e9c7515c89933f2e88da89f84738a7927cac20afeb892792040a97f8f08d71ae0e4f2ebb3313f2b12c0c371a48fc7837b97fb658e4d6d5e3339a3f69849152e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
