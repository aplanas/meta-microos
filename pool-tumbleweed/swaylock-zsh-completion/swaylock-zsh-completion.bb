SUMMARY = "Zsh completion for swaylock"
DESCRIPTION = "Zsh command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "swaylock-zsh-completion-1.7.2-1.1.noarch.rpm"
RPM_HASH = "824ec5b29f580e7ee82226e0cced4dc67f39f28d4def108d22eecaa02298be6d3e6e983193b198366d3b9a1da4ca26ed52a109c21181db406f3594080388b4b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-zsh-completion"
RDEPENDS:${PN} += "swaylock"

inherit rpm
