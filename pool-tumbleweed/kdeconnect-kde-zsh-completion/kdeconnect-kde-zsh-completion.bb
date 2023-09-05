SUMMARY = "ZSH completion for kdeconnect-kde"
DESCRIPTION = "ZSH command line completion support for kdeconnect-kde."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdeconnect-kde-zsh-completion-23.08.0-1.1.noarch.rpm"
RPM_HASH = "79f563bb78a38be178671af9f1a20325d3365abfcb12a3883b8def596bdebe1773723fce2d19d3d26805e5fe06a5a9fe07a3da618cff1e278d14cfacb16298b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-zsh-completion"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
