SUMMARY = "ZSH completion for dust"
DESCRIPTION = "ZSH completion script for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-zsh-completion-0.8.6-1.2.noarch.rpm"
RPM_HASH = "d01341189fe5b2ba16032f71d96a0d48f41f933acc531f4b5b9d14baefa5d38f8cac0dd95b99496254a6a686dccbc59a463698d8f610aa232aa8f29b308cec70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
