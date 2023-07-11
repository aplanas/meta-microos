SUMMARY = "Zsh completion for glab"
DESCRIPTION = "Zsh command line completion support for glab."
LICENSE = "MIT"

PV = "1.31.0"

RPM_NAME = "glab-zsh-completion-1.31.0-1.1.noarch.rpm"
RPM_HASH = "fceeb1a7fe54b25768b54a7b480807dd8b08bab38afb0f3150504356f66531a9ecc07c416f367d07224c9a9a4f68599b27e548e9c48142804d548b1d6f090269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-zsh-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
