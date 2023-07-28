SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "install-initrd-openSUSE-17.89-1.57.aarch64.rpm"
RPM_HASH = "3d51b4c69acf9b8d79828dbf7f5f0c74e2191b023236b42fdf884572365be84e7ae199adc5c1ae8f9775fa9ba7b177c9c17103590e3d5586703015b2f5d0c86e"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
