SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-openSUSE-17.91-1.84.aarch64.rpm"
RPM_HASH = "5eeca240154df4ed14f1df4efb4e4fa6119cbe76eaca3aeb8474c8065fc4fd52e6eb23c64f05c527bc4c94fb1710657fe3827d5e13322af78956541f34955e86"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
