SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.34.0"

RPM_NAME = "gh-zsh-completion-2.34.0-1.1.noarch.rpm"
RPM_HASH = "b5e8a93ed5bc7e361e826abf927c51ae50abd2d67a4d08731bf1cad92cb94af04b41189e35e3bd61a3d907c935e231c0ee1ce5bd50f54434f950aebb7efa57ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
