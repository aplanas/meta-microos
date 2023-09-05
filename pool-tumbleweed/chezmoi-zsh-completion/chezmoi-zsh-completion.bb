SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.38.0"

RPM_NAME = "chezmoi-zsh-completion-2.38.0-1.1.noarch.rpm"
RPM_HASH = "f9b2147b5c25b94af2b3ccbef5de18c3bead10c6845f6780d00ec698bf6831a5be7cccb86ebe74cf422abd217611ddb7bfeed176e684038d7d76d4b51489b950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
