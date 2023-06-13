SUMMARY = "Zsh completion for highlight"
DESCRIPTION = "This package provides Zsh command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-zsh-completion-4.6-1.1.noarch.rpm"
RPM_HASH = "922facf6e23167f7ce126fb41a655bc1b8687fd7c5963d809213b516393cb8efe769cec84d3cf1d862fd2fc65752e1c934952a7ebf20431bb9dd4e186de4b3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-zsh-completion"

RDEPENDS:${PN} += "highlight \
zsh"

inherit rpm
