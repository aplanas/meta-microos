SUMMARY = "ZSH Completion for nnn"
DESCRIPTION = "The official zsh completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-zsh-completion-4.8-1.2.noarch.rpm"
RPM_HASH = "1e4ca52aab9d15019338b36ce54cfe5d0eaebb20e8893c0acad18406e55db714114421c6c9b4bed0ed3f98e931e669e1ae083058657f6ec8540581e8886c52f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
