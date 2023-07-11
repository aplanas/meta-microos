SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-zsh-completion-5.66-1.8.noarch.rpm"
RPM_HASH = "07f7f8eeb2fe5ca5ff88623f66edef3ba3bb41a8b3834e4299b88d6a695563c0b471c808a0c3152f0a009be76b56984c7b6e3c422b869a81193c59605e6962dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"

RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
