SUMMARY = "Zsh Completion for river"
DESCRIPTION = "Zsh command-line completion support for river."
LICENSE = "GPL-3.0-only"

PV = "0.2.4+g953"

RPM_NAME = "river-zsh-completion-0.2.4+g953-1.1.noarch.rpm"
RPM_HASH = "e9f7273b56e7c697a490f1917d33a78b72877ce01ca9e22496a653b5ca642fe871007cd433c9c90262d14c95a3f3a199d5821221a630fc6c7a006f477a190cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "river-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
