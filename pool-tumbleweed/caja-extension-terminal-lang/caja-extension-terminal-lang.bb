SUMMARY = "Translations for package caja-extension-terminal"
DESCRIPTION = "Provides translations for the 'caja-extension-terminal' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-lang-0.10-3.7.noarch.rpm"
RPM_HASH = "344941bb2a59c3f508e5276cb13f52334f5c629e58256bc7462cc30c8052a8a949e0a99b8d300a369e801915d64c29d0a972f13254f3692ec7d771510868ba6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal-lang \
caja-extension-terminal-lang-all \
locale-caja-extension-terminal-bg \
locale-caja-extension-terminal-ca \
locale-caja-extension-terminal-cs \
locale-caja-extension-terminal-de \
locale-caja-extension-terminal-es \
locale-caja-extension-terminal-fr \
locale-caja-extension-terminal-he \
locale-caja-extension-terminal-hu \
locale-caja-extension-terminal-it \
locale-caja-extension-terminal-lv \
locale-caja-extension-terminal-nb \
locale-caja-extension-terminal-nl \
locale-caja-extension-terminal-pl \
locale-caja-extension-terminal-pt \
locale-caja-extension-terminal-pt-BR \
locale-caja-extension-terminal-ro \
locale-caja-extension-terminal-ru \
locale-caja-extension-terminal-sv \
locale-caja-extension-terminal-tr"

RDEPENDS:${PN} += "caja-extension-terminal"

inherit rpm
