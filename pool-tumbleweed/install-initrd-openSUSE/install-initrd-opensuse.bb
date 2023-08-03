SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "install-initrd-openSUSE-17.90-1.24.aarch64.rpm"
RPM_HASH = "6fcd999440a842b4cdc270e9bba940014c69dfffbc41665800dfc6ca684f0b70cd7b85ccd7f1f6a6c15d375e2f299ed15acd6e48a4b8f7d2c2b6ee01acec2d34"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
