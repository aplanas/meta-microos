SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-zsh-completion-5.68-4.1.noarch.rpm"
RPM_HASH = "77fc5af541d5e2ddfb663cfcd81e39467fac16b284c8a48c1a11b1818c03856f020af69c8a9d95290511c6686bade272aca3169899ad9e45d914561093b4e1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"

RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
