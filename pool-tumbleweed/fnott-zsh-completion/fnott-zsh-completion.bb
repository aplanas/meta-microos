SUMMARY = "Zsh Completion for fnott"
DESCRIPTION = "Zsh command-line completion support for fnott"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "fnott-zsh-completion-1.4.0-2.1.noarch.rpm"
RPM_HASH = "518262d9ed2f1be2e52cb71e5491019caa8dfe85e21b80e1bc5d74add473e799fe97f6469dfcae920ad361fee9eb1bbda09929d72ae86f0c206ccad78ae969d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fnott-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
