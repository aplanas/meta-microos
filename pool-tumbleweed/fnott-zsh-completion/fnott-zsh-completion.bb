SUMMARY = "Zsh Completion for fnott"
DESCRIPTION = "Zsh command-line completion support for fnott"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "fnott-zsh-completion-1.4.0-1.1.noarch.rpm"
RPM_HASH = "3dacda4a09ae4e98c59c3c2b9b9ef40402fbdfb99d19688fb02d3c4b3fabd6edc59d27438943be86662757fdae6566512510e68f0679378ff88b047cc7308738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnott-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
