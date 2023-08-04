SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "install-initrd-MicroOS-17.90-1.30.aarch64.rpm"
RPM_HASH = "130c7d7ab2160f9562a262306776914ed4fbcc833cd356028554b838de880199cce2c036adc132fac96a28869d314cf1a48e64e5902cf6ad952b89bc67524db3"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
