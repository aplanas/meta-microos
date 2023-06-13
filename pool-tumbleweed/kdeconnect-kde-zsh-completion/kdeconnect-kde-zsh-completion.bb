SUMMARY = "ZSH completion for kdeconnect-kde"
DESCRIPTION = "ZSH command line completion support for kdeconnect-kde."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdeconnect-kde-zsh-completion-23.04.1-2.1.noarch.rpm"
RPM_HASH = "d6ecc0dea0c8324911eacd584d1c5b11f96b409e1484b297d10fbafda116b20bb5d25225ac7adf44e0ca326f3c37813a7a260005fb5b985338bb6554f04658db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-zsh-completion"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
