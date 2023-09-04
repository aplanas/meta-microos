SUMMARY = "Create initrd for openSUSE installation"
DESCRIPTION = "You can create an initrd for openSUSE installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-openSUSE-17.91-1.67.aarch64.rpm"
RPM_HASH = "fa91f7b86b4e9f1d19a9266959b357bbf1a61b1dc3123b041e4ac786309fffe978a7c837795a2e2f333a3b42f174247800a4d4b8a1c552482ed89eb221110385"

RPROVIDES:${PN} += "install-initrd \
install-initrd-openSUSE"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
