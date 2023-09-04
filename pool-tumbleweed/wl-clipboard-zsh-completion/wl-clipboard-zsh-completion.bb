SUMMARY = "Zsh completion for wl-clipboard"
DESCRIPTION = "Zsh command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "wl-clipboard-zsh-completion-2.2.0-1.1.noarch.rpm"
RPM_HASH = "953d067541422cef61a83d936c847b8bddd125bef9b493557f5354507c44ed9c333c6115b3ded56aee6043037eda9c5833ee8e3685a62f4a71f029dba30d1ac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-zsh-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
