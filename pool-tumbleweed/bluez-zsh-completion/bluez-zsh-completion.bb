SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-zsh-completion-5.69-1.1.noarch.rpm"
RPM_HASH = "e85776cdd5185ccc4a8402868f9782518da5131a880cbedda7323a62ceb92d591bb50e6083706be390615c794fc0989a0492b4687c00f11c7c684c486976b422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"

RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
