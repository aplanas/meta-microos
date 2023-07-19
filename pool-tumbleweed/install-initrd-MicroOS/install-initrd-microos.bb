SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-MicroOS-17.89-1.46.aarch64.rpm"
RPM_HASH = "29f7c3c2123e8183e8d2201e28ecc19cc655ef9cedfe7222be39a668e8ebb162ec6b12a297d8bb88fb6f5993b1a8dd192f229d804cb957c73186e1ed44fb8201"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
