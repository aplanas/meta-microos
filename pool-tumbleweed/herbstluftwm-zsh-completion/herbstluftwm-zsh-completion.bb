SUMMARY = "Zsh completion for herbstluftwm"
DESCRIPTION = "ZSH completion for herbstclient"
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-zsh-completion-0.9.5-1.5.noarch.rpm"
RPM_HASH = "878108294543f4ec3408273635f187c20e3ab6151c5ff9fba09ee14ff7d3388b305891c4d220bc03c12f450f08bc579c9d9f79c0668dcd02474b0923bcc81323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-zsh-completion"

RDEPENDS:${PN} += "herbstluftwm"

inherit rpm
