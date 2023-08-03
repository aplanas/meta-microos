SUMMARY = "Zsh completion for highlight"
DESCRIPTION = "This package provides Zsh command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-zsh-completion-4.7-1.1.noarch.rpm"
RPM_HASH = "d76f014d9ca12da107886aa32903e57c5e8eebff5f6434bb8ebdd8e6d3a8a928ebe255f9f26ebddd93a91d0ca3ba7065609d65fb60740e7b4ddf5e85cba6a819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-zsh-completion"

RDEPENDS:${PN} += "highlight \
zsh"

inherit rpm
