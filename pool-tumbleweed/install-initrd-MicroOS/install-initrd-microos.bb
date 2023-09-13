SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-MicroOS-17.91-1.98.aarch64.rpm"
RPM_HASH = "8d5398c04f00606aa47fe69e2558ffe612118eb43709cea2da87ce676e167e02f75450a9e01d6cc908545a82241b2acd028c2898e72a8b5c7aeb63364fae0546"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
