SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.39.1"

RPM_NAME = "chezmoi-zsh-completion-2.39.1-1.1.noarch.rpm"
RPM_HASH = "9d1fb608909eea12ff48db260352cfe6dc3b89c0f9982340b49aea6eece4e6c8816daa61ac0bd978632109debf2968542d0163e98fcd89584ceab49177b47283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
