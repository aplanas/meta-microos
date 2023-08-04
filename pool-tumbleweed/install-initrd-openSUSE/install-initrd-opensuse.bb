SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "install-initrd-openSUSE-17.90-1.28.aarch64.rpm"
RPM_HASH = "80a3fe52d49750dfc6b4a5e10cb2d8267d2fcec98a53c00852b5d37f692859408321ef34cf3ab1e40ce5fd93488b76f6f42921b6309ab5c93e4b1caddc94d696"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
