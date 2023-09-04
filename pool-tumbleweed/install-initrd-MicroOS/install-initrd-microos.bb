SUMMARY = "Create initrd for MicroOS installation"
DESCRIPTION = "You can create an initrd for MicroOS installation. Useful, for example, to set \
up a UML or XEN environment."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "install-initrd-MicroOS-17.91-1.66.aarch64.rpm"
RPM_HASH = "ebaf46696abab1968f292a1978fd2ed7b4e9cdeff56cb5583617b6515ab9e407f232e82fbaf383deebf40c6a8fef66c0a1af32b7e77d13825b10116d4c4b4ab8"

RPROVIDES:${PN} += "install-initrd \
install-initrd-MicroOS"

RDEPENDS:${PN} += "/usr/bin/ln \
/usr/bin/sh"

inherit rpm
