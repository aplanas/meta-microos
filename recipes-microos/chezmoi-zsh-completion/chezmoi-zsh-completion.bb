SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.4"

RPM_NAME = "chezmoi-zsh-completion-2.33.4-1.1.noarch.rpm"
RPM_HASH = "406b4e4787dcfa25b67cb30017baf3f0e784d84f0d912b25feaa1e99203540e183b6852f1835731fb1f225645ecb30e6af259d4a7bbf3583b2f41cbdfe91ae90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"
RDEPENDS:${PN} += "chezmoi"

inherit rpm
