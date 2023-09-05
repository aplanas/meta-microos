SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-zsh-completion-5.68-4.2.noarch.rpm"
RPM_HASH = "3f8d1acf6881e267ed1f6bca2b14243bc6820fd9feb5351eacf7ad3e9fa4985375db1893c3aa0639fd788f2c3c90c8d2bdd3334e1ebfbaabb6686894a3eddbac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"

RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
