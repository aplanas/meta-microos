SUMMARY = "Zsh completion for wl-clipboard"
DESCRIPTION = "Zsh command line completion support for wl-clipboard."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "wl-clipboard-zsh-completion-2.1.0-1.7.noarch.rpm"
RPM_HASH = "137916c3cc74ea500349228899b2a2f3833623970202c7f330866b8473614044dc6c8e459c2e8934ddaa5c50137d6acf569dc374cb0b1d4b9ac1598cca668d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wl-clipboard-zsh-completion"

RDEPENDS:${PN} += "wl-clipboard"

inherit rpm
