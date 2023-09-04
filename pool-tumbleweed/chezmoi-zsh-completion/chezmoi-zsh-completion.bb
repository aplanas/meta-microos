SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.37.0"

RPM_NAME = "chezmoi-zsh-completion-2.37.0-1.1.noarch.rpm"
RPM_HASH = "96f0305cc88085e4ea4ca9e57902578a86bd7c77db9942b5da22f992eea1201b6597a679022e73eaf177ca0d189782600315ef2bbea6f2ad556c853deb90ce6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
