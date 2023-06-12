SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-zsh-completion-5.66-1.6.noarch.rpm"
RPM_HASH = "f48c1fd01d343a692c80e9e00cd936ebb6186acce5bc193411df2b14f93cc1ef761996e29545f8eecd0117c2a8becad05d9692cf5a9c23cad6f4116e263b4a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"
RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
