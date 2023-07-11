SUMMARY = "Zsh completion for tig"
DESCRIPTION = "Zsh command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-zsh-completion-2.5.8-1.3.noarch.rpm"
RPM_HASH = "cbcec8dfe49f66f8338a8203f5a47665a8b11f30019e941f0a988b02618864d9ec7e7c56ed3336ec077ddb80d0b8017e0f3841c302934bb47f409c8f469f5162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-zsh-completion"

RDEPENDS:${PN} += "tig \
zsh"

inherit rpm
