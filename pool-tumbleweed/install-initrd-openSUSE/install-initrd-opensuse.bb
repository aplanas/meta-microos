SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-openSUSE-17.89-1.40.aarch64.rpm"
RPM_HASH = "d76cb6eae44a535897474396949a208e37d7fb90581cc4c5c10a090bcd15fca06706611bdb8e09b2a107c6377327729fca7b58a28fcac4239e953520d4fd9425"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
