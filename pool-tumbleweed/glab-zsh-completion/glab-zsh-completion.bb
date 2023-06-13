SUMMARY = "Zsh completion for glab"
DESCRIPTION = "Zsh command line completion support for glab."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "glab-zsh-completion-1.30.0-1.1.noarch.rpm"
RPM_HASH = "d809b083c119681242fa3e13a903bf52d37103f0386e0563f1ba05fc55334ff4fa1bb0000672b00bf8ba75ff2691063c20848a36b99cfe60db608f6f47cdd76c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glab-zsh-completion"

RDEPENDS:${PN} += "glab"

inherit rpm
