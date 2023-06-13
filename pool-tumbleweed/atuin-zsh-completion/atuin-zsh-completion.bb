SUMMARY = "Zsh completion for atuin"
DESCRIPTION = "Zsh command line completion support for atuin."
LICENSE = "MIT"

PV = "14.0.1"

RPM_NAME = "atuin-zsh-completion-14.0.1-1.1.noarch.rpm"
RPM_HASH = "ec65163a5d663c2b5c7e38b3ca7a403b9f2b61d3b6fc09d5043e516c95741c30952ead656c1554f4affcb2ce8503d93ea6cbb81d125ce02bd17856e2324c1339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-zsh-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
