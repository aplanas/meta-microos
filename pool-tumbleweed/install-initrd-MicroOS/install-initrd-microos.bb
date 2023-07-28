SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-MicroOS-17.89-1.56.aarch64.rpm"
RPM_HASH = "59673e0fd21aab1da8d86a848762979f264f381d6aa691cc27536a0549920efa22a48e85235d4106b1674140d2cb01ebfae0e175f7725f19a27fe99f6376237f"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
